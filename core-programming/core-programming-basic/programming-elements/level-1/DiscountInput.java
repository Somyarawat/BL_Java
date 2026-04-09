import java.util.*;
class DiscountInput{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount %: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("Discount : " + discount + " Final Fee : " + finalFee);
        sc.close();
    }
}
