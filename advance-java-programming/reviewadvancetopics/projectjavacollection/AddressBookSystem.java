import java.util.*;
public class AddressBookSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility u = new Utility();
        int choice;
        

        do { 
            System.out.println("1. Add User");
            System.out.println("2. Display User");
            System.out.println("3. Write");
            System.out.println("4. Exit");
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();
            

            switch(choice){
                case 1:
                    try {
                        System.out.println("Enter Name: ");
                        String name = sc.next();
                        System.out.println("Enter Address: ");
                        String address = sc.next();
                        System.out.println("Enter Phone No: ");
                        String phoneNo = sc.next();

                        if(phoneNo.length() != 10){
                            throw new Exception("Phone No must be of 10 digit");
                        }
                        UserDetails user = new UserDetails(name, address, phoneNo);
                        u.addUser(user);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2 :
                    u.displayUser();
                    break;

                case 3 :
                    u.write();
                    break;
                    
                case 4 :
                    System.out.println("Exit");
                    break;

                default :
                System.out.println("Invalid Choice");
                break;
            }

        } while(choice < 4);
    }
}