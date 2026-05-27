
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class QuantifierExample{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{2,4}");
        Matcher matcher = pattern.matcher("12 123 12345 1");
        boolean matches = matcher.matches();
        System.out.println(matches);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}