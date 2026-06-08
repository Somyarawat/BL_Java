
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class StreamObject {
    public static void main(String[] args) {
        Stream<Object> stream = Stream.empty();
        stream.forEach(e -> {
            System.out.println(e);
        });

        String[] names = {"Somya", "Kartikey", "Harshita", "Sambhav"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        Stream<Object> stream3 = Stream.builder().build();

        IntStream stream4 = Arrays.stream(new int[]{10, 22, 01, 24, 26, 6});
        stream4.forEach(e -> {
            System.out.println(e);
        });

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Watermelon");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Litchi");
        fruits.forEach(f -> {
            System.out.println(f);
        });
    }
}