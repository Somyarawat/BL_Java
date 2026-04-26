class BankAccount {
    @SuppressWarnings("unused")
    int accNo;
    @SuppressWarnings("unused")
    double balance;

    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    @SuppressWarnings("unused")
    double interest;

    SavingsAccount(int accNo, double balance, double interest) {
        super(accNo, balance);
        this.interest = interest;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    @SuppressWarnings("unused")
    double limit;

    CheckingAccount(int accNo, double balance, double limit) {
        super(accNo, balance);
        this.limit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    @SuppressWarnings("unused")
    int period;

    FixedDepositAccount(int accNo, double balance, int period) {
        super(accNo, balance);
        this.period = period;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

@SuppressWarnings("unused")
class Bank {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1, 5000, 5);
        CheckingAccount c = new CheckingAccount(2, 3000, 1000);
        FixedDepositAccount f = new FixedDepositAccount(3, 10000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}