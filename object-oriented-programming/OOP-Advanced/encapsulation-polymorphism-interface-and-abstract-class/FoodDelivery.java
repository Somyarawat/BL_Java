interface Discountable {
    double applyDiscount();
}

abstract class FoodItem {
    @SuppressWarnings("unused")
    String name;
    double price;
    int qty;

    FoodItem(String n, double p, int q) {
        name = n; price = p; qty = q;
    }

    abstract double total();
}

class VegItem extends FoodItem implements Discountable {
    VegItem(String n, double p, int q) { super(n,p,q); }

    @SuppressWarnings("override")
    double total() { return price * qty; }
    @SuppressWarnings("override")
    public double applyDiscount() { return 50; }
}

class NonVegItem extends FoodItem {
    NonVegItem(String n, double p, int q) { super(n,p,q); }

    @SuppressWarnings("override")
    double total() { return price * qty + 100; }
}

public class FoodDelivery {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken", 300, 2);

        System.out.println(f1.total());
        System.out.println(f2.total());
    }
}