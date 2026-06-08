import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(22);
        list.add(1);
        list.add(24);
        System.out.println("List: " + list);

        Stream<Integer> stream = list.stream();
        List<Integer> evenList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("List of Even Numbers: " + evenList);
    }
}