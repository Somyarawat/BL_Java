import java.util.Scanner;
class Stack {
    int top = -1;
    char arr[] = new char[100];
    void push(char value) {
        top++;
        arr[top] = value;
    }

    char pop() {
        char value = arr[top];
        top--;
        return value;
    }

    boolean isEmpty() {
        return top == -1;
    }
}
public class BalancedParenthesesChecker {
    static boolean checkBalanced(String expression) {
        Stack stack = new Stack();
        int i = 0;
        while (i < expression.length()) {
            char ch = expression.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                        return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expression : ");
        String expression = sc.next();
        boolean result = checkBalanced(expression);
        if (result) {
            System.out.println("Balanced Parentheses");
        }
        else {
            System.out.println("Not Balanced Parentheses");
        }
    }
}