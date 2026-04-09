import java.util.*;
class Handshakes{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numbers Of Students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2 ;

        System.out.println("Total Handshakes: " + handshakes);
        sc.close();
    }
}
