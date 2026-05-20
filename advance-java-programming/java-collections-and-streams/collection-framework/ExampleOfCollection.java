import java.util.*;
class ExampleOfCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add(1,"C++");

        System.out.println("Programming Languages: ");
        System.out.println(list);
        //for(String s : list){
        //    System.out.println(s);
        }
    }
