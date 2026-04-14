import java.util.*;
class Chocolates {
    public static int[] distribute(int choco, int children) {
        int each = choco / children;
        int rem = choco % children;

        return new int[]{each, rem};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number Of Chocolate: ");
        int  choco = sc.nextInt();
        System.out.print("Number Of Children: ");
        int  children = sc.nextInt();
        int[] res = distribute(choco, children);

        System.out.println("Each gets: " + res[0]);
        System.out.println("Remaining: " + res[1]);

    }
}