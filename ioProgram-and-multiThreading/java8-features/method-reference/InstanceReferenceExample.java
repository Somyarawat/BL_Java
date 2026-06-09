
import java.util.List;


class Printer{
    void print(String s){
        System.out.println(s);
    }
}
public class InstanceReferenceExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        List<String> names = List.of("Luv", "Kush", "Anshul", "Pranshul");
        names.forEach(printer::print);
    }
}