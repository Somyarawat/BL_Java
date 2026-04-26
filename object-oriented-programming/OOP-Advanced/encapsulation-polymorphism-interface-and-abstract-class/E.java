import java.util.*;

interface Taxable {
    double calculateTax();
}

abstract class Product {
    @SuppressWarnings("unused")
    private final int id;
    private final String name;
    private final double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @SuppressWarnings("override")
    double calculateDiscount() { return getPrice() * 0.1; }
    @SuppressWarnings("override")
    public double calculateTax() { return getPrice() * 0.18; }
}

class Clothing extends Product implements Taxable {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @SuppressWarnings("override")
    double calculateDiscount() { return getPrice() * 0.2; }
    @SuppressWarnings("override")
    public double calculateTax() { return getPrice() * 0.12; }
}

class Groceries extends Product {
    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @SuppressWarnings("override")
    double calculateDiscount() { return 0; }
}

public class E {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Electronics(1, "Laptop", 50000));
        list.add(new Clothing(2, "Shirt", 2000));
        list.add(new Groceries(3, "Rice", 1000));

        for (Product p : list) {
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();

            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}