import java.util.*;
import java.util.regex.Pattern;
class PhoneNumber{
    public static void checker(String RE, String str){
        boolean match = Pattern.matches("[0-9]{10}", str);
        System.out.println(match);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();

        checker("[0-9]{10}", str);
    }
}