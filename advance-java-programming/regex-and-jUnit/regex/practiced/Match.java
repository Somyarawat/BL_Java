import java.util.regex.Pattern;
class Match {
    public static void main(String[] args) {
        //String regex = "a";
        //Pattern pattern = Pattern.compile("ab");
        //Matcher matcher = pattern.matcher("a");
        //Pattern pattern = Pattern.compile("a*b*");
        //Matcher matcher = pattern.matcher("aaaa");
        //Pattern pattern = Pattern.compile("a+b*");
        //Matcher matcher = pattern.matcher("aa");
        //Pattern pattern = Pattern.compile("a{2,4}");
        //Matcher matcher = pattern.matcher("aa");
        //boolean matches = matcher.matches();

        boolean matches = Pattern.matches("a*b*", "aaa");

        System.out.println("Result: " + matches);
    }
}