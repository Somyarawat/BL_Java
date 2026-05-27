import java.util.*;
class Passenger {
    private int id;
    private String name;
    private int age;
    private String source;
    private String destination;
    private double wallet;

    Passenger(int id, String name, int age, String source, String destination, double wallet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.source = source;
        this.destination = destination;
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}

public class PassengerRegistration {

    ArrayList<Passenger> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    void addPassenger() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for(Passenger p : list) {
            if(p.getId() == id) {
                System.out.println("Duplicate ID Not Allowed");
            }
        }
        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Source: ");
        String source = sc.next();

        System.out.print("Enter Destination: ");
        String destination = sc.next();

        System.out.print("Enter Wallet Balance: ");
        double wallet = sc.nextDouble();

        Passenger p = new Passenger(id, name, age, source, destination, wallet);

        list.add(p);

        System.out.println("Passenger Added Successfully");
    }

    void display() {
        if(list.isEmpty()) {
            System.out.println("No Passengers Found");
        }

        for(Passenger p : list) {
            System.out.println("Passenger ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());
            System.out.println("Source: " + p.getSource());
            System.out.println("Destination: " + p.getDestination());
            System.out.println("Wallet Balance: " + p.getWallet());
        }
    }

    void search() {
        System.out.print("Enter Passenger ID: ");
        int id = sc.nextInt();
        for(Passenger p : list) {
            if(p.getId() == id) {
                System.out.println("Passenger Found");
                System.out.println("Passenger ID: " + p.getId());
                System.out.println("Name: " + p.getName());
                System.out.println("Age: " + p.getAge());
                System.out.println("Source: " + p.getSource());
                System.out.println("Destination: " + p.getDestination());
                System.out.println("Wallet Balance: " + p.getWallet());
            }
        }
        System.out.println("Passenger Not Found");
    }

    void removePassenger() {
        System.out.print("Enter Passenger ID: ");
        int id = sc.nextInt();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                list.remove(i);
                System.out.println("Passenger Removed");
            }
        }
        System.out.println("Passenger Not Found");
    }

    void updatePassenger() {
        System.out.print("Enter Passenger ID: ");
        int id = sc.nextInt();
        for(Passenger p : list) {
            if(p.getId() == id) {
                System.out.print("Enter New Name: ");
                p.setName(sc.next());

                System.out.print("Enter New Age: ");
                p.setAge(sc.nextInt());

                System.out.print("Enter New Source: ");
                p.setSource(sc.next());

                System.out.print("Enter New Destination: ");
                p.setDestination(sc.next());

                System.out.print("Enter New Wallet Balance: ");
                p.setWallet(sc.nextDouble());

                System.out.println("Passenger Updated Successfully");
            }
        }
        System.out.println("Passenger Not Found");
    }

    public static void main(String[] args) {
    PassengerRegistration obj = new PassengerRegistration();
    int choice = 0;
    
    while(choice != 6) {
        System.out.println("1. Add Passenger");
        System.out.println("2. Display Passengers");
        System.out.println("3. Search Passenger");
        System.out.println("4. Remove Passenger");
        System.out.println("5. Update Passenger");
        System.out.println("6. Exit");
        System.out.print("Enter Choice: ");
        choice = obj.sc.nextInt();
        switch(choice) {
            case 1 -> obj.addPassenger();
            case 2 -> obj.display();
            case 3 -> obj.search();
            case 4 -> obj.removePassenger();
            case 5 -> obj.updatePassenger();
            case 6 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid Choice");
        }
    }
}
}