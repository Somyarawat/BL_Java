import java.util.*;

class CharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1)
                    System.out.println(ch + " -> Vowel");
                else
                    System.out.println(ch + " -> Consonant");
            } else {
                System.out.println(ch + " -> Not Letter");
            }
        }
    }
}