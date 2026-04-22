class BankAccount{
    @SuppressWarnings("unused")
    String accountHolder;
    @SuppressWarnings("unused")
    int accountNumber;
    double balance;

    BankAccount(String name, int number, double balance){
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double amt){
        balance += amt;
    }

    void withdraw(double amt){
        if(amt <= balance){
            balance -= amt;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    void display(){
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Lata", 101, 50000);
        acc.deposit(15000);
        acc.withdraw(5000);
        acc.display();
    }
}