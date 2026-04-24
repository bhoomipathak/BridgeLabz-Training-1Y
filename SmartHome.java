import java.time.LocalTime;

class TemperatureSensor implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(LocalTime.now() + " | Temperature Sensor reading... [Cycle " + i + "] | Priority: " + Thread.currentThread().getPriority());
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Temperature thread interrupted");
        }
    }
}

class SecurityCamera extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(LocalTime.now() + " | Security Camera recording... [Cycle " + i + "] | Priority: " + getPriority());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Security thread interrupted");
        }
    }
}

class LightController implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(LocalTime.now() + " | Light adjusting... [Cycle " + i + "] | Priority: " + Thread.currentThread().getPriority());
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            System.out.println("Light thread interrupted");
        }
    }
}

class DoorLockMonitor extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(LocalTime.now() + " | Door lock checking... [Cycle " + i + "] | Priority: " + getPriority());
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            System.out.println("Door thread interrupted");
        }
    }
}

public class SmartHome {
    public static void main(String[] args) throws InterruptedException {

        Thread tempThread = new Thread(new TemperatureSensor());
        tempThread.setPriority(7);

        SecurityCamera securityThread = new SecurityCamera();
        securityThread.setPriority(10);

        Thread lightThread = new Thread(new LightController());
        lightThread.setPriority(5);

        DoorLockMonitor doorThread = new DoorLockMonitor();
        doorThread.setPriority(5);

        tempThread.start();
        securityThread.start();
        lightThread.start();
        doorThread.start();

        tempThread.join();
        securityThread.join();
        lightThread.join();
        doorThread.join();

        System.out.println("All devices finished execution.");
    }
}