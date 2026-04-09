import java.util.*;
class TotalPrice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        double total = price * qty;
        System.out.println("Total Price: INR " + total);
    }
}
