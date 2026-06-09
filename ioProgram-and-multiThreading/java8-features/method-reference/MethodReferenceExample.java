
import java.util.Arrays;


class MethodReferenceExample {
    static void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        String[] fruits = {"Mango", "Guava", "Grapes"};
        Arrays.stream(fruits).forEach(MethodReferenceExample::print);
    }
}