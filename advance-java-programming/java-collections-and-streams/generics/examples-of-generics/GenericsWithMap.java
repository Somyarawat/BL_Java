import java.util.*;
class GenericsWithMap{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"Luv");
        map.put(4,"Umang");
        map.put(1,"Kush");
        map.put(3,"Kartikey");

        String s = map.get(3);
        System.out.println(s);

        map.forEach((key,value) -> {
            System.out.println(key + "," + value);
        });
    }
}