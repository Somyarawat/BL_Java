class Node {
    String name;
    Node next;

    Node(String name) {
        this.name = name;
    }
}

public class CircularPassengerList {
    static Node head = null;
    
    static void add(String name) {
        Node newNode = new Node(name);
        if(head == null) {
            head = newNode;
            head.next = head;
        }
        else {
            Node temp = head;
            
            while(temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    static void display() {
        if(head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;

        while(temp.next != head) {
            System.out.println(temp.name);
            temp = temp.next;
        }
        System.out.println(temp.name);
    }

    public static void main(String[] args) {
        add("Aman");
        add("Riya");
        add("Karan");
        System.out.println("Circular Passenger Route");
        display();
    }
}