
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MetaCharactersExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d\\D");
        Matcher matcher = pattern.matcher("7a 8b 99");
        boolean matches = matcher.matches();
        System.out.println(matches);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}