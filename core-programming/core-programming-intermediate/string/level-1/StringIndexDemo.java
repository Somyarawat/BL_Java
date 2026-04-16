import java.util.*;

class StringIndexDemo {

    public static void generate(String str) {
        System.out.println(str.charAt(100));
    }

    public static void handle(String str) {
        try {
            System.out.println(str.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generate(text);
        handle(text);
    }
}