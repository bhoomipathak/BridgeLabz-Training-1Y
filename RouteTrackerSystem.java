public class RouteTrackerSystem {

    // 🔷 Base Class
    abstract static class Checkpoint {
        String checkpointId, locationName;
        double distanceFromLast;
        int expectedDuration, actualDuration;

        public Checkpoint(String id, String loc, double dist, int exp, int act) {
            this.checkpointId = id;
            this.locationName = loc;
            this.distanceFromLast = dist;
            this.expectedDuration = exp;
            this.actualDuration = act;
        }

        boolean isDelayed() {
            return actualDuration > expectedDuration;
        }

        abstract boolean isCritical();
        abstract String getType();
        abstract double calculatePenalty();
    }

    // 🔷 Delivery
    static class DeliveryCheckpoint extends Checkpoint {
        public DeliveryCheckpoint(String id, String loc, double dist, int exp, int act) {
            super(id, loc, dist, exp, act);
        }

        boolean isCritical() { return true; }

        String getType() { return "DeliveryCheckpoint"; }

        double calculatePenalty() {
            return isDelayed() ? (actualDuration - expectedDuration) * 2 : 0;
        }
    }

    // 🔷 Fuel
    static class FuelCheckpoint extends Checkpoint {
        public FuelCheckpoint(String id, String loc, double dist, int exp, int act) {
            super(id, loc, dist, exp, act);
        }

        boolean isCritical() { return true; }

        String getType() { return "FuelCheckpoint"; }

        double calculatePenalty() {
            return isDelayed() ? 10 : 0;
        }
    }

    // 🔷 Rest
    static class RestCheckpoint extends Checkpoint {
        public RestCheckpoint(String id, String loc, double dist, int exp, int act) {
            super(id, loc, dist, exp, act);
        }

        boolean isCritical() { return false; }

        String getType() { return "RestCheckpoint"; }

        double calculatePenalty() {
            if (!isDelayed()) return 0;
            int delay = actualDuration - expectedDuration;
            return (delay > 30) ? delay * 0.5 : 0;
        }
    }

    // 🔷 Custom Linked List
    static class RouteLinkedList<T extends Checkpoint> {

        class Node {
            T data;
            Node next;

            Node(T data) {
                this.data = data;
            }
        }

        Node head;

        void addCheckpoint(T cp) {
            Node newNode = new Node(cp);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }

        boolean removeCheckpoint(String id) {
            if (head == null) return false;

            if (head.data.checkpointId.equals(id)) {
                head = head.next;
                return true;
            }

            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.checkpointId.equals(id)) {
                    temp.next = temp.next.next;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        T findCheckpoint(String id) {
            Node temp = head;
            while (temp != null) {
                if (temp.data.checkpointId.equals(id)) return temp.data;
                temp = temp.next;
            }
            return null;
        }

        double computeTotalDistance() {
            double total = 0;
            Node temp = head;
            while (temp != null) {
                total += temp.data.distanceFromLast;
                temp = temp.next;
            }
            return total;
        }

        double computeTotalPenalty() {
            double total = 0;
            Node temp = head;
            while (temp != null) {
                total += temp.data.calculatePenalty();
                temp = temp.next;
            }
            return total;
        }

        boolean checkCriticalConsistency() {
            boolean hasDelivery = false, hasFuel = false;

            Node temp = head;
            while (temp != null) {
                if (temp.data instanceof DeliveryCheckpoint) hasDelivery = true;
                if (temp.data instanceof FuelCheckpoint) hasFuel = true;
                temp = temp.next;
            }

            return hasDelivery && hasFuel;
        }

        void printRoute() {
            Node temp = head;
            int i = 1;

            while (temp != null) {
                Checkpoint cp = temp.data;
                String status = cp.isDelayed() ? "Delayed" : "On Time";

                System.out.println(i + ". " + cp.getType() + " – " +
                        cp.locationName + " – " + status +
                        " – Penalty: " + cp.calculatePenalty());

                temp = temp.next;
                i++;
            }
        }
    }

    // 🔷 Driver
    static class Driver {
        String driverId, name;
        RouteLinkedList<Checkpoint> routeHistory = new RouteLinkedList<>();

        public Driver(String id, String name) {
            this.driverId = id;
            this.name = name;
        }

        void printSummary() {
            System.out.println("Driver: " + driverId + " – " + name);
            System.out.println("Route Summary:");

            routeHistory.printRoute();

            double distance = routeHistory.computeTotalDistance();
            double penalty = routeHistory.computeTotalPenalty();
            double score = distance - penalty;

            System.out.println("Total Distance: " + distance + " km");
            System.out.println("Total Penalty: " + penalty);
            System.out.println("Route Score: " + score);

            boolean ok = routeHistory.checkCriticalConsistency();
            System.out.println("Critical Route Check: " +
                    (ok ? "All required checkpoints" : "Missing critical checkpoints"));
        }
    }

    // 🔷 MAIN
    public static void main(String[] args) {

        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));

        driver.routeHistory.addCheckpoint(
                new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));

        driver.routeHistory.addCheckpoint(
                new RestCheckpoint("C3", "Motel X", 10, 20, 25));

        driver.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C4", "Client Hub", 60, 90, 105));

        driver.printSummary();
    }
}