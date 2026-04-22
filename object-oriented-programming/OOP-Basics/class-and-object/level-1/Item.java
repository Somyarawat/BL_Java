class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int code, String name, double price){
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    void calculate(int qty){
        double totalCost = price * qty;

        System.out.println("The total cost of " + itemName + " with item code " + itemCode +  " is: " + totalCost);
    }

    public static void main(String[] args) {
        Item i = new Item(101, "Watch", 2000);
        i.calculate(5);
    }
}