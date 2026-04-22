class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String name, String model, int days){
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    void cost(){
        int totalCost = rentalDays * 1000;
        System.out.println(customerName + " rent " + carModel + " for " + rentalDays + " days cost " + totalCost);
    }

    public static void main(String[] args) {
        CarRental car = new CarRental("Luv", "SUV", 3);
        car.cost();
    }
}