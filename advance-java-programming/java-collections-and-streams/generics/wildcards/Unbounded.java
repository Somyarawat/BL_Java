import java.util.*;
class Unbounded {
    static void checker(List <?> l){
        System.out.println(l);
    }
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        checker(l1);
    }
}