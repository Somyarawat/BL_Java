
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Greater10 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(1);
        list.add(24);
        list.add(26);
        list.add(6);
        System.out.println("List: " + list);

        Stream<Integer> stream = list.stream();
        List<Integer> greater = stream.filter(i -> i > 10).collect(Collectors.toList());
        System.out.println("List having number greater than 10: " + greater);
    }
}