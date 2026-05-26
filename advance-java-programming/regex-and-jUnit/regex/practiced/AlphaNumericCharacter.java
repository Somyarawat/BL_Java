import java.util.*;
import java.util.regex.Pattern;
class AlphaNumericCharacter {

    static void checker(String RE, String str){
        boolean matches = Pattern.matches("[a-zA-Z0-9]+", str);
        System.out.println(matches);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        String str = sc.next();

        checker("[a-zA-Z0-9]+", str);
    }
}