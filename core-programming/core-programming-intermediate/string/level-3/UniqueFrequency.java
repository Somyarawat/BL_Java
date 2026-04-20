import java.util.*;

class UniqueFrequency {

    public static char[] unique(String text) {
        char[] temp = new char[text.length()];
        int idx = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) temp[idx++] = text.charAt(i);
        }

        return Arrays.copyOf(temp, idx);
    }

    public static int count(String text, char ch) {
        int c = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = unique(text);

        for (char c : unique) {
            System.out.println(c + " -> " + count(text, c));
        }
    }
}