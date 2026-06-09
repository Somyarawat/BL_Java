
import java.util.List;

class InstanceRefStream{
    public static void main(String[] args) {
        List<String> fruits = List.of("Mango", "Banana", "Guava", "Grapes", "Litchi");
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);   
    }
}