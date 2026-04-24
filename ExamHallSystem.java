class EntryMonitor extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Entry Monitoring... Cycle " + i +
                        " | State: " + Thread.currentThread().getState());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Entry interrupted");
        }
    }
}

class QuestionPaper extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Question Paper Distribution Started | State: " + getState());
            Thread.sleep(2000);
            System.out.println("Question Paper Distributed");
        } catch (InterruptedException e) {
            System.out.println("QP interrupted");
        }
    }
}

class Attendance extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("Attendance Marking Started | State: " + getState());
            Thread.sleep(3000);
            System.out.println("Attendance Completed");
        } catch (InterruptedException e) {
            System.out.println("Attendance interrupted");
        }
    }
}

class Collection extends Thread {
    public void run() {
        try {
            Thread.sleep(15000);
            System.out.println("Answer Sheet Collection Started | State: " + getState());
            Thread.sleep(3000);
            System.out.println("Answer Sheets Collected");
        } catch (InterruptedException e) {
            System.out.println("Collection interrupted");
        }
    }
}

public class ExamHallSystem {
    public static void main(String[] args) throws InterruptedException {

        EntryMonitor entry = new EntryMonitor();
        QuestionPaper qp = new QuestionPaper();
        Attendance att = new Attendance();
        Collection col = new Collection();

        entry.setPriority(5);
        qp.setPriority(10);
        att.setPriority(8);
        col.setPriority(7);

        System.out.println("Initial States:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("QP: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());

        entry.start();
        qp.start();
        att.start();
        col.start();

        System.out.println("\nAfter Starting:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("QP: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());

        entry.join();
        qp.join();
        att.join();
        col.join();

        System.out.println("\nFinal States:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("QP: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());

        System.out.println("Exam Process Completed");
    }
}