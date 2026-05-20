import java.util.*;
class Lower{
    static void checkLower(List<? super Integer> l) {
        System.out.println(l);
    }
    public static void main(String[] args) {
        List<Number> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        checkLower(l1);
        checkLower(l2);
    }
}