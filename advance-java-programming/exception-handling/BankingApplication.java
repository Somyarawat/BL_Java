import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class BankingApplication {
    static double balance = 5000.0;
    static void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance! Available Balance: ₹" + balance
            );
        }
        balance -= amount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Current Balance: ₹" + balance);
            System.out.print("Enter amount to withdraw: ₹");
            double amount = sc.nextDouble();
            withdraw(amount);
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid Input!");
        } 
        finally {
            System.out.println("Transaction Completed.");
            sc.close();
        }
    }
}