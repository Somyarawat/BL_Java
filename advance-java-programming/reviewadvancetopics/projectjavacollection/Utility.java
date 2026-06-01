import java.io.*;
import java.util.*;

interface AddressBook {
    public void addUser();
    public void displayUsers();
    public void write();
}

public class Utility implements AddressBook{
    ArrayList<UserDetails> list = new ArrayList<>();
    String fileName = "file.txt";
    public void addUser(UserDetails user){
        list.add(user);
        System.out.println("User added");
    }
    public void displayUser(){
        if(list.isEmpty()){
            System.out.println("User Not Found");
        }
        for(UserDetails user : list){
            System.out.println("Name: " + user.name);
            System.out.println("Address: " + user.address);
            System.out.println("Phone No: " + user.phoneNo);
        }
    }
    @Override
    public void write(){
        try {
            FileWriter fw = new FileWriter(fileName);
            for(UserDetails user : list){
                fw.write(user.name);
                fw.write(user.address);
                fw.write(user.phoneNo);
            }
            fw.close();
            System.out.println("Data Saved");
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}