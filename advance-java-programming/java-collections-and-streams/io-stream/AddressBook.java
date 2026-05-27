import java.io.*;
import java.util.*;
class Contact implements Serializable {
    String name;
    String address;
    String phone;
    
    Contact(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}

public class AddressBook {
    static String fileName = "addressbook.txt";
    static void addContact() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Name : ");
            String name = sc.next();
            System.out.print("Enter Address : ");
            String address = sc.next();
            System.out.print("Enter Phone : ");
            String phone = sc.next();
            
            FileOutputStream fos = new FileOutputStream(fileName, true);
            PrintWriter pw = new PrintWriter(fos);
            pw.println(name + "," + address + "," + phone);
            pw.close();
            System.out.println("Contact Saved");
        } 
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    static void displayContacts() {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ByteArrayInputStream bis = new ByteArrayInputStream(line.getBytes());
                byte arr[] = bis.readAllBytes();
                String data = new String(arr);
                String details[] = data.split(",");

                System.out.println("Name : " + details[0]);
                System.out.println("Address : " + details[1]);
                System.out.println("Phone : " + details[2]);
            }
            br.close();
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }

    static void searchContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name To Search : ");
        String search = sc.next();
        boolean found = false;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String details[] = line.split(",");
                if (details[0].equalsIgnoreCase(search)) {
                    System.out.println("Contact Found");

                    System.out.println("Name : " + details[0]);
                    System.out.println("Address : " + details[1]);
                    System.out.println("Phone : " + details[2]);
                    found = true;
                }
            }
            br.close();
            if (found == false) {
                System.out.println("Contact Not Found");
            }
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }

    static void updateContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name To Update : ");
        String updateName = sc.next();
        File oldFile = new File(fileName);
        File newFile = new File("temp.txt");
        boolean found = false;
        try {
            FileReader fr = new FileReader(oldFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);
            String line;
            while ((line = br.readLine()) != null) {
                String details[] = line.split(",");
                if (details[0].equalsIgnoreCase(updateName)) {
                    System.out.print("Enter New Address : ");
                    String newAddress = sc.next();
                    System.out.print("Enter New Phone : ");
                    String newPhone = sc.nextLine();
                    bw.write(details[0] + "," +
                            newAddress + "," +
                            newPhone);
                            found = true;
                            System.out.println("Contact Updated");
                        } 
                        else {
                            bw.write(line);
                        }
                        bw.newLine();
            }
            br.close();
            bw.close();

            oldFile.delete();
            newFile.renameTo(oldFile);
            if (found == false) {
                System.out.println("Contact Not Found");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name To Delete : ");
        String deleteName = sc.nextLine();
        File oldFile = new File(fileName);
        File newFile = new File("temp.txt");
        boolean found = false;
        try {
            FileReader fr = new FileReader(oldFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);
            String line;
            while ((line = br.readLine()) != null) {
                String details[] = line.split(",");if (details[0].equalsIgnoreCase(deleteName)) {
                    found = true;
                    System.out.println("Contact Deleted");

                }
                else {
                    bw.write(line);
                    bw.newLine();
                }
            }

            br.close();
            bw.close();

            oldFile.delete();
            newFile.renameTo(oldFile);
            if (found == false) {
                System.out.println("Contact Not Found");
            }

        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        OUTER:
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addContact();
                case 2 -> displayContacts();
                case 3 -> searchContact();
                case 4 -> updateContact();
                case 5 -> deleteContact();
                case 6 -> {
                    System.out.println("Program Ended");
                    break OUTER;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}