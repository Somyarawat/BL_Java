import java.util.*;
class SpringSeasonMethod {
    public static boolean isSpring(int m, int d){
                return (m == 3 && d >= 20)
                        || (m > 3 && m < 6)
                        || (m == 6 && d <= 20);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month: ");
        int m = sc.nextInt();
        System.out.print("Enter Day: ");
        int d = sc.nextInt();

        if(isSpring(m, d)) {
            System.out.println("Its a Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }
    }
}