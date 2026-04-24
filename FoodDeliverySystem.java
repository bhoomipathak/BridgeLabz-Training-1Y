class Order implements Runnable {
    int orderId;
    String restaurant;
    int deliveryTime;
    String type;

    public Order(int orderId, String restaurant, int deliveryTime, String type) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
        this.type = type;
    }

    public void run() {
        try {
            long start = System.currentTimeMillis();

            System.out.println(Thread.currentThread().getName() +
                    " handling Order " + orderId + " (" + type + ") from " + restaurant + " → Picked up");

            Thread.sleep(deliveryTime * 1000);

            System.out.println(Thread.currentThread().getName() +
                    " handling Order " + orderId + " → In Transit");

            Thread.sleep(deliveryTime * 1000);

            System.out.println(Thread.currentThread().getName() +
                    " handling Order " + orderId + " → Delivered");

            long end = System.currentTimeMillis();

            System.out.println("Order " + orderId + " completed in " + (end - start) / 1000 + " seconds\n");

        } catch (InterruptedException e) {
            System.out.println("Order interrupted");
        }
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Order(101, "Dominos", 2, "Express"));
        Thread t2 = new Thread(new Order(102, "KFC", 3, "Standard"));
        Thread t3 = new Thread(new Order(103, "McDonalds", 1, "Express"));
        Thread t4 = new Thread(new Order(104, "Subway", 4, "Economy"));
        Thread t5 = new Thread(new Order(105, "Pizza Hut", 2, "Standard"));

        t1.setName("Agent-1");
        t2.setName("Agent-2");
        t3.setName("Agent-3");
        t4.setName("Agent-4");
        t5.setName("Agent-5");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(10);
        t4.setPriority(3);
        t5.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("All orders delivered.");
    }
}