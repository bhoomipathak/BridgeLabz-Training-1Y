class BankAccount {
    String accountHolder;
    String accountType;

    public BankAccount(String accountHolder, String accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }
}

class User implements Runnable {
    BankAccount account;

    public User(BankAccount account) {
        this.account = account;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    Thread.currentThread().getName() + " (" +
                    account.accountType + ") is checking balance... [Check " + i +
                    "] | Priority: " + Thread.currentThread().getPriority()
                );
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Anushka", "Premium");
        BankAccount acc2 = new BankAccount("Riya", "Regular");
        BankAccount acc3 = new BankAccount("Rahul", "Basic");

        Thread t1 = new Thread(new User(acc1));
        Thread t2 = new Thread(new User(acc2));
        Thread t3 = new Thread(new User(acc3));

        t1.setName("User-1");
        t2.setName("User-2");
        t3.setName("User-3");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}