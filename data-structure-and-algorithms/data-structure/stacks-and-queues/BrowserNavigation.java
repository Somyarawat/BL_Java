import java.util.Scanner;
class Stack {
    int top = -1;
    String arr[] = new String[100];

    void push(String data) {
        top++;
        arr[top] = data;
    }

    String pop() {
        if (top == -1) {
            return "Empty";
        }
        String value = arr[top];
        top--;
        return value;
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    String peek() {
        if (top == -1) {
            return "Empty";
        }
        return arr[top];
    }
}

public class BrowserNavigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack backStack = new Stack();
        Stack forwardStack = new Stack();
        String currentPage = "Home Page";
        int choice = 0;
        while (choice != 5) {
            System.out.println("Current Page : " + currentPage);
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1 -> {
                    backStack.push(currentPage);
                    System.out.print("Enter New Page URL : ");
                    currentPage = sc.next();
                    forwardStack = new Stack();
                    System.out.println("Page Visited Successfully!");
                }
                case 2 -> {
                    if (backStack.isEmpty()) {
                        System.out.println("No Previous Page!");
                    }
                    else {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("Moved Back!");
                    }
                }
                case 3 -> {
                    if (forwardStack.isEmpty()) {
                        System.out.println("No Forward Page!");
                    }
                    else {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("Moved Forward!");
                    }
                }
                case 4 -> System.out.println("Current Page : " + currentPage);
                case 5 -> System.out.println("Program Ended.");
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}