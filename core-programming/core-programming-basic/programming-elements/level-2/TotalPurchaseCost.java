import java.util.*;
class TotalPurchaseCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Unit Price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int q = sc.nextInt();

        double totalPrice = unitPrice * q;
        System.out.println("The total purchase price is: INR " + totalPrice + 
        " if the quantity: " + q + " and unit price is: INR " + unitPrice);
    }
}
