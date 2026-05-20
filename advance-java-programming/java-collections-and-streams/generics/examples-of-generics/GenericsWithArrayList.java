import java.util.*;
class GenericsWithArrayList{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Luv");
        list.add("Kush");
        list.add("Kartikey");
        list.add("26");

        String s = list.get(0);
        System.out.println(s);

        for(String e : list){
            System.out.println(e);
        }
    }
}