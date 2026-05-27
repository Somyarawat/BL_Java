import java.util.*;
public class PassengerTravelAnalytics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rajiv Chowk", 120);
        map.put("Kashmere Gate", 85);
        map.put("Noida City Center", 60);
        
        System.out.println("Passenger Count Per Station");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Station Name: ");
        String station = sc.next();

        if(map.containsKey(station))
            System.out.println("Frequency: " + map.get(station));
        else
            System.out.println("Station Not Found");
    }
}