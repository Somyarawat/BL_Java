import java.util.*;

public class MetroSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        while(choice != 7) {
            System.out.println("===== SMART METRO SYSTEM =====");
            System.out.println("1. Passenger Registration Module");
            System.out.println("2. Ticket Booking Queue Module");
            System.out.println("3. Recently Visited Stations Module");
            System.out.println("4. Passenger Travel Analytics Module");
            System.out.println("5. Circular Passenger List Module");
            System.out.println("6. Sorting and Searching Module");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1 -> {
                    System.out.println("\n--- Passenger Registration Module ---");
                    PassengerRegistration.main(null);
                }
                case 2 -> {
                    System.out.println("\n--- Ticket Booking Queue Module ---");
                    TicketBookingQueue.main(null);
                }
                case 3 -> {
                    System.out.println("\n--- Recently Visited Stations Module ---");
                    RecentlyVisitedStations.main(null);
                }
                case 4 -> {
                    System.out.println("\n--- Passenger Travel Analytics Module ---");
                    PassengerTravelAnalytics.main(null);
                }
                case 5 -> {
                    System.out.println("\n--- Circular Passenger List Module ---");
                    CircularPassengerList.main(null);
                }
                case 6 -> {
                    System.out.println("\n--- Sorting and Searching Module ---");
                    SortSearch.main(null);
                }
                case 7 -> System.out.println("Exiting Smart Metro System...");
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}