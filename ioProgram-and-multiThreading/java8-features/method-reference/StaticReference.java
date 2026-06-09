
import java.util.List;


class MathUtil{
    static void square(int n){
        System.out.println(n*n);
    }
}
public class StaticReference{
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.forEach(MathUtil::square);
    }
}