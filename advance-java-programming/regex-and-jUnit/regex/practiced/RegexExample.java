
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher("The number is 123 and code is 456");
        boolean matches = matcher.matches();
        System.out.println(matches);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}