import java.util.*;

class FirstNonRepeating {

    public static char findChar(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }

        return '#';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char result = findChar(text);

        if (result == '#') System.out.println("No unique char");
        else System.out.println("First non-repeating: " + result);
    }
}