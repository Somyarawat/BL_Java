class Order {
    @SuppressWarnings("unused")
    int orderId;
    @SuppressWarnings("unused")
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    @SuppressWarnings("unused")
    String trackingNumber;

    ShippedOrder(int id, String date, String trackingNumber) {
        super(id, date);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Delivered on " + deliveryDate);
    }
}

@SuppressWarnings("unused")
class OrderSystem {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(1, "10-Apr", "TR123", "15-Apr");
        d.getOrderStatus();
    }
}