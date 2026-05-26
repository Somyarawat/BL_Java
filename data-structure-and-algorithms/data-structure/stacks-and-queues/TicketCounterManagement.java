import java.util.Scanner;
class Queue {
    int front = -1;
    int rear = -1;
    int arr[] = new int[100];

    void enqueue(int ticketNumber) {
        if (front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = ticketNumber;
        System.out.println("Ticket Added");
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("No Customers in Queue");
        }
        System.out.println("Ticket Served : " + arr[front]);
        front++;
    }
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        }
        int i = front;
        while (i <= rear) {
            System.out.println("Ticket Number : " + arr[i]);
            i++;
        }
    }

    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        }
        System.out.println("Next Ticket : " + arr[front]);
    }
}
public class TicketCounterManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Add Ticket");
            System.out.println("2. Serve Ticket");
            System.out.println("3. Display Queue");
            System.out.println("4. Next Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Ticket Number : ");
                    int ticket = sc.nextInt();
                    queue.enqueue(ticket);
                }
                case 2 -> queue.dequeue();
                case 3 -> queue.display();
                case 4 -> queue.peek();
                case 5 -> System.out.println("Program Ended.");
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}