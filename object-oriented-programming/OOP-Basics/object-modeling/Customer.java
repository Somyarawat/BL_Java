import java.util.*;

class Product {
    @SuppressWarnings("unused")
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void display() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        System.out.println("Total: " + total);
    }
}

class Customer {
    String name;

    Customer(String n) {
        name = n;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed order");
        o.display();
    }

    public static void main(String[] args) {
        Customer c = new Customer("Somya");

        Order o = new Order();
        o.addProduct(new Product("Watch", 2000));

        c.placeOrder(o);
    }
}