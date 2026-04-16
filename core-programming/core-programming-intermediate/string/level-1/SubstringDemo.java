import java.util.*;

class SubstringDemo {
    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String manual = getSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Same? " + compare(manual, builtIn));
    }
}