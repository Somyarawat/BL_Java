class BankAccountModifier {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.accountNumber = 101;      
        s.accountHolder = "Kush";  
        s.setBalance(5000);         

        s.showDetails();
    }
}

class SavingsAccount extends BankAccountModifier {

    void showDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);

        System.out.println("Balance: " + getBalance());
    }
}