import java.util.*;

class SplitWithoutMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int words = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') words++;
        }

        String[] arr = new String[words];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                arr[index++] = word;
                word = "";
            }
        }
        arr[index] = word;

        String[] built = text.split(" ");

        System.out.println(Arrays.equals(arr, built));
    }
}