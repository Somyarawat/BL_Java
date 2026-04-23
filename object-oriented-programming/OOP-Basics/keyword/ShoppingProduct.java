class ShoppingProduct {

    static double discount = 10;

    final int productID;
    String name;
    double price;
    int quantity;

    ShoppingProduct(String name, double price, int quantity, int productID) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void display() {
        double finalPrice = price - (price * discount / 100);
        System.out.println(name + " with product ID " + productID + " having quantity " + quantity + " with final Price: " + finalPrice);
    }

    public static void main(String[] args) {

        ShoppingProduct p = new ShoppingProduct("Watch", 2000, 2, 101);

        if (p instanceof ShoppingProduct) {
            p.display();
        }

        ShoppingProduct.updateDiscount(20);
        p.display();
    }
}