import java.util.*;

class LengthWithoutMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}

        System.out.println("Manual length: " + count);
        System.out.println("Built-in: " + text.length());
    }
}