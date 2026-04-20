import java.util.*;

class MinMaxWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");

        String min = words[0];
        String max = words[0];

        for (String word : words) {
            if (word.length() < min.length()) {
                min = word;
            }
            if (word.length() > max.length()) {
                max = word;
            }
        }

        System.out.println("Shortest: " + min);
        System.out.println("Longest: " + max);
    }
}