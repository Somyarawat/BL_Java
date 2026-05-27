import java.util.*;
class RecentlyVisitedStations {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        while(choice != 4) {
            System.out.println("1 Add Station");
            System.out.println("2 Undo Station");
            System.out.println("3 Display History");
            System.out.println("4 Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.next();

            switch(choice) {
                case 1 -> {
                    System.out.print("Enter Station: ");
                    String station = sc.next();
                    stack.push(station);
                    System.out.println("Station Added");
                }
                case 2 -> {
                    if(stack.isEmpty())
                        System.out.println("No History");
                    else
                        System.out.println("Removed: " + stack.pop());
                }
                case 3 -> System.out.println(stack);
                case 4 -> System.out.println("Exit");
                default -> System.out.println("Invalid");
            }
        }
    }
}