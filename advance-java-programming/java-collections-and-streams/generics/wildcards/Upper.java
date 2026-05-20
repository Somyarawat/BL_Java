import java.util.*;
class Upper{
    static void checkUpper(List <? extends Number> l){
        System.out.println(l);
    }
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Number> l2 = new ArrayList<>();
        checkUpper(l1);
        checkUpper(l2);
    }
}