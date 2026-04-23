class Customer {
    String name;
    double balance;

    Customer(String n) {
        name = n;
        balance = 0;
    }

    void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}

class Bank {
    @SuppressWarnings("unused")
    String bName;

    Bank(String name) {
        this.bName = name;
    }

    void openAccount(Customer c, double amount) {
        c.balance += amount;
        System.out.println("Account opened for " + c.name);
    }

    public static void main(String[] args) {
        Bank b = new Bank("SBI");
        Customer c = new Customer("Somya");

        b.openAccount(c, 5000);
        c.viewBalance();
    }
}