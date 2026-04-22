class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String b, String m, double p) {
        this.brand = b;
        this.model = m;
        this.price = p;
    }

    void display() {
        System.out.println(brand + " " + model + " with price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Samsung", "S21", 70000);
        m.display();
    }
}