import java.util.*;
class MethodsOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 22, 01, 24, 26, 06));
        cities.add("Banglore");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add(1, "Hyderabad");

        System.out.println("Number: " + nums);
        System.out.println("Size of NumsArray: " + nums.size());
        System.out.println("Cities: " + cities);
        System.out.println("Size of CitiesArray: " + cities.size());

        System.out.println("City at Index 2: " + cities.get(2));

        cities.set(1, "New Delhi");
        System.out.println("After Updating: " + cities);

        cities.remove(3);
        cities.remove("Mumbai");
        System.out.println("After removing element: " + cities);

        //cities.add("Mumbai");
        //Collections.sort(cities);
        //System.out.println("After Sorting: " + cities);
        //Collections.sort(nums);
        //System.out.println("After sorting number array: " + nums);

        for(String c : cities){
            System.out.println(c);
        }

        //Iterator<String> it = cities.iterator();
        //while(it.hasNext()){
            //System.out.println(it.next());
        //}
        Iterator <Integer> it = nums.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        cities.forEach(c -> {
            System.out.println(c);
        });

        System.out.println("Contains Banglore: " + cities.contains("Banglore"));
        System.out.println("Index of Banglore: " + cities.indexOf("Banglore"));

        List<Integer> sub = nums.subList(0, 4);
        System.out.println("Sub List: " + sub);
    }
}