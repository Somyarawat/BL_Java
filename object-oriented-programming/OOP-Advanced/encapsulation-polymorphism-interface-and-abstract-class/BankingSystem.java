interface Loanable {
    void applyForLoan();
}

abstract class BankAccount {
    @SuppressWarnings("unused")
    private final int accNo;
    private double balance;

    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public double getBalance() { return balance; }

    @SuppressWarnings("unused")
    void deposit(double amt) { balance += amt; }
    @SuppressWarnings("unused")
    void withdraw(double amt) { balance -= amt; }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(int acc, double bal) { super(acc, bal); }

    @SuppressWarnings("override")
    double calculateInterest() { return getBalance() * 0.05; }
    @SuppressWarnings("override")
    public void applyForLoan() { System.out.println("Loan Approved"); }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int acc, double bal) { super(acc, bal); }

    @SuppressWarnings("override")
    double calculateInterest() { return 0; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(1, 10000);
        BankAccount a2 = new CurrentAccount(2, 20000);

        System.out.println(a1.calculateInterest());
        System.out.println(a2.calculateInterest());
    }
}