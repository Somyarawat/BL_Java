import java.util.*;

class WordLength2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        for (String[] result1 : result) {
            System.out.println(result1[0] + " -> " + result1[1]);
        }
    }
}