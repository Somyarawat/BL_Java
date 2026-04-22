class CartItem {
    String itemName;
    double price;
    int quantity;

    void add(String item, double p, int qty){
        itemName = item;
        price = p;
        quantity = qty;
    }

    @SuppressWarnings("unused")
    void remove(){
        quantity = 0;
    }

    void total(){
        double totalCost = price * quantity;
        System.out.println("Total Cost of: " + itemName + " is " + totalCost);
    }

    public static void main(String[] args) {
        CartItem cItem = new CartItem();
        cItem.add("Watch", 2000, 1);
        cItem.total();
    }
}