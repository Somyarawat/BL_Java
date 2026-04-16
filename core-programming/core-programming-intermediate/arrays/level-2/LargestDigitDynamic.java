import java.util.Scanner;

class LargestDigitDynamic {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int size = 10;
        int[] digits = new int[size];
        int index = 0;

        while (num > 0) {
            if (index == size) {
                size += 10;
                int[] temp = new int[size];
                for (int i = 0; i < digits.length; i++)
                    temp[i] = digits[i];
                digits = temp;
            }

            digits[index++] = num % 10;
            num /= 10;
        }

        int max = 0, second = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > max) {
                second = max;
                max = digits[i];
            } else if (digits[i] > second && digits[i] != max) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + max);
        System.out.println("Second Largest = " + second);
    }
}