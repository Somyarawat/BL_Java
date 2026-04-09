class Discount {
    public static void main(String[] args) {

        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("Discount amount is INR " + discount + " and the Final Fee is INR " + finalFee);
    }
}
