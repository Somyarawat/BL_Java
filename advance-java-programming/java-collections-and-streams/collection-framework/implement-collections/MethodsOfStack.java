import java.util.*;
class MethodsOfStack{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);
        System.out.println("Top Element: " + s.peek());
        System.out.println("Top Element with pop: " + s.pop());
        System.out.println("Final Stack: " + s);
    }
}