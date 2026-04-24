
class Account {
    int accountNumber;
    double balance;
    static String bankName = "SBI";

    Account(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int acc, double bal) {
        super(acc, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int acc, double bal) {
        super(acc, bal);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}