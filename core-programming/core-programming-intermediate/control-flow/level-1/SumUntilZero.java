import java.util.*;
class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        System.out.print("Enter Value: ");
        double value = sc.nextDouble();

        while(value > 0) {
            total += value;
            System.out.print("Enter Value: ");
            value = sc.nextDouble();
        }
        System.out.println(total);
    }
}
