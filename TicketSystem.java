import java.util.*;

class Ticket extends Thread {
    int ticketId;
    String type;
    int priority;
    int queuePosition;
    int sleepTime;

    static Map<Integer, List<Long>> waitTimes = new HashMap<>();

    public Ticket(int ticketId, String type, int priority, int queuePosition) {
        this.ticketId = ticketId;
        this.type = type;
        this.priority = priority;
        this.queuePosition = queuePosition;
        this.sleepTime = new Random().nextInt(5) + 1;
    }

    public void run() {
        try {
            long startWait = System.currentTimeMillis();

            System.out.println("Ticket " + ticketId + " [" + type + "] | Priority: " + priority +
                    " | Queue: " + queuePosition + " | Agent: " + getName() + " → START");

            long startProcess = System.currentTimeMillis();

            Thread.sleep(sleepTime * 1000);

            long endProcess = System.currentTimeMillis();

            long waitTime = startProcess - startWait;

            synchronized (waitTimes) {
                waitTimes.putIfAbsent(priority, new ArrayList<>());
                waitTimes.get(priority).add(waitTime);
            }

            System.out.println("Ticket " + ticketId + " [" + type + "] → COMPLETE in " +
                    (endProcess - startProcess) / 1000 + " sec");

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class TicketSystem {
    public static void main(String[] args) throws InterruptedException {

        List<Ticket> tickets = new ArrayList<>();

        tickets.add(new Ticket(1, "Critical Bug", 10, 1));
        tickets.add(new Ticket(2, "Feature Request", 4, 5));
        tickets.add(new Ticket(3, "General Query", 2, 7));
        tickets.add(new Ticket(4, "Feedback", 1, 9));
        tickets.add(new Ticket(5, "Critical Bug", 10, 2));
        tickets.add(new Ticket(6, "Feature Request", 4, 6));
        tickets.add(new Ticket(7, "General Query", 2, 8));
        tickets.add(new Ticket(8, "Critical Bug", 10, 3));
        tickets.add(new Ticket(9, "Feedback", 1, 10));
        tickets.add(new Ticket(10, "Feature Request", 4, 4));

        tickets.sort((a, b) -> b.priority - a.priority);

        int agentNum = 1;
        long totalStart = System.currentTimeMillis();

        for (Ticket t : tickets) {
            t.setName("Agent-" + agentNum++);
            t.setPriority(t.priority);
            t.start();
        }

        for (Ticket t : tickets) {
            t.join();
        }

        long totalEnd = System.currentTimeMillis();

        System.out.println("\nTotal Processing Time: " + (totalEnd - totalStart) / 1000 + " sec");

        System.out.println("\nAverage Wait Time per Priority:");

        for (Map.Entry<Integer, List<Long>> entry : Ticket.waitTimes.entrySet()) {
            int priority = entry.getKey();
            List<Long> times = entry.getValue();

            long sum = 0;
            for (long t : times) sum += t;

            System.out.println("Priority " + priority + " → " + (sum / times.size()) + " ms");
        }
    }
}