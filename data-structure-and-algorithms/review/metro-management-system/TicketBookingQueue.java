import java.util.*;
class TicketBookingQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        while(choice != 5) {
            System.out.println("1 Add Booking");
            System.out.println("2 Process Booking");
            System.out.println("3 View Next");
            System.out.println("4 Display Queue");
            System.out.println("5 Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1 -> {
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.next();
                    queue.add(name);
                    System.out.println("Booking Added");
                }
                case 2 -> {
                    if(queue.isEmpty()) {
                        System.out.println("Queue Empty");
                    }
                    else {
                        System.out.println("Processed: " + queue.poll());
                    }
                }
                case 3 -> {
                    if(queue.isEmpty()) {
                        System.out.println("Queue Empty");
                    }
                    else {
                        System.out.println("Next Passenger: " + queue.peek());
                    }
                }
                case 4 -> {
                    if(queue.isEmpty()) {
                        System.out.println("Queue Empty");
                    }
                    else {
                        System.out.println("Pending Queue: " + queue);
                    }
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}

