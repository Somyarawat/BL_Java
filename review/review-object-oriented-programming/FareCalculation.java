abstract class Booking {
    private String bookingId;
    private String passengerName;
    private double distanceKm;

    Booking(String bookingId, String passengerName, double distanceKm) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        setDistanceKm(distanceKm); 
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("Distance must be greater than 0");   //
        }
        this.distanceKm = distanceKm;
    }
    
    public abstract double calculateFare();

    public void printBookingDetails() {
        System.out.println("Booking ID: " + bookingId +
                ", Passenger: " + passengerName +
                ", Distance: " + distanceKm + " km");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Booking)) return false;

        Booking other = (Booking) obj;
        return this.bookingId.equals(other.bookingId);
    }
}

interface Cancellable {
    double cancelBooking(String reason);
}

interface RatingEnabled {
    void submitRating(int stars);
}

class RegularBooking extends Booking implements Cancellable, RatingEnabled {

    RegularBooking(String id, String name, double distance) {
        super(id, name, distance);
    }

    @Override
    public double calculateFare() {
        double base = getDistanceKm() * 10;
        return base;
    }

    @Override
    public double cancelBooking(String reason) {
        System.out.println("Regular booking cancelled: " + reason);
        return calculateFare() * 0.9; // 90% refund
    }

    @Override
    public void submitRating(int stars) {
        System.out.println("Regular Booking Rated: " + stars + " stars");
    }
}

class SurgeBooking extends Booking implements Cancellable, RatingEnabled {   

    SurgeBooking(String id, String name, double distance) {
        super(id, name, distance);
    }

    @Override
    public double calculateFare() {
        double base = getDistanceKm() * 10;
        return base * 1.8;
    }

    @Override
    public double cancelBooking(String reason) {
        System.out.println("Surge booking cancelled: " + reason);
        return calculateFare() * 0.8;
    }

    @Override
    public void submitRating(int stars) {
        System.out.println("Surge Booking Rated: " + stars + " stars");
    }
}

class CorporateBooking extends Booking implements Cancellable, RatingEnabled {

    CorporateBooking(String id, String name, double distance) {
        super(id, name, distance);
    }

    @Override
    public double calculateFare() {
        double base = getDistanceKm() * 10;
        return base * 0.85; 
    }

    public double applyCorpDiscount() {
        return calculateFare() * 0.85; 
    }

    public double applyCorpDiscount(double pct) {
        return calculateFare() * (1 - pct);
    }

    public double applyCorpDiscount(double pct, String companyCode) {
        System.out.println("Company Code Applied: " + companyCode);
        return calculateFare() * (1 - pct);
    }

    @Override
    public double cancelBooking(String reason) {
        System.out.println("Corporate booking cancelled: " + reason);
        return calculateFare() * 0.95;
    }

    @Override
    public void submitRating(int stars) {
        System.out.println("Corporate Booking Rated: " + stars + " stars");
    }
}

public class FareCalculation {
    public static void main(String[] args) {

        Booking[] bookings = new Booking[3];

        bookings[0] = new RegularBooking("B101", "Amit", 10);
        bookings[1] = new SurgeBooking("B102", "Raj", 15);   
        bookings[2] = new CorporateBooking("B103", "Neha", 20);

        for (Booking b : bookings) {
            b.printBookingDetails();
            System.out.println("Fare: " + b.calculateFare());

            if (b instanceof Cancellable c) {
                System.out.println("Refund: " + c.cancelBooking("Change of plan"));
            }

            if (b instanceof RatingEnabled r) {
                r.submitRating(5);
            }

            if (b instanceof CorporateBooking cb) {
                System.out.println("Corp Discount (default): " + cb.applyCorpDiscount());
                System.out.println("Corp Discount (20%): " + cb.applyCorpDiscount(0.20));
                System.out.println("Corp Discount (25% + code): " +
                        cb.applyCorpDiscount(0.25, "COMP123"));
            }
        }

        Booking b1 = new RegularBooking("B200", "Test", 5);
        Booking b2 = new RegularBooking("B200", "Test2", 8);

        System.out.println("Are bookings equal? " + b1.equals(b2));
    }
}