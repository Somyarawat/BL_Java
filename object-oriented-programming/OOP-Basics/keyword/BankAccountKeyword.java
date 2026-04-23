class BankAccountKeyword {

    static String bankName = "SBI";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolder;

    BankAccountKeyword(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;   
        this.accountNumber = accountNumber;   
        totalAccounts++;
    }

    void display() {
        System.out.println(accountHolder + " " + accountNumber + " " + bankName);
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {

        BankAccountKeyword b = new BankAccountKeyword("Lata", 101);

        if (b instanceof BankAccountKeyword) {  
            b.display();
        }

        BankAccountKeyword.getTotalAccounts();
    }
}