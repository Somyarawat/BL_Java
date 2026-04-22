class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;
    }

    void displayProductDetails(){
        System.out.println(productName + " " + price);
    }

    static void displayTotalProducts(){
        System.out.println("Total Product: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Watch", 50);
        Product p2 = new Product("Perfume", 100);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
