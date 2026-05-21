import java.util.*;
class MethodsOfSet{
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");
        System.out.println("Set: " + hashSet);
        System.out.println("Set contains Mango: " + hashSet.contains("Mango"));
        hashSet.remove("Apple");
        System.out.println("Final: " + hashSet);

        Set<String> linked = new LinkedHashSet<>();
        linked.add("Papaya");
        linked.add("Grapes");
        linked.add("Melon");
        System.out.println("Set: " + linked);

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(30);
        tree.add(5);
        tree.add(20);
        System.out.println("Tree Set: " + tree);
        System.out.println("First Element: " + tree.first());
        System.out.println("Last Element: " + tree.last());
        System.out.println("HeadSet: " + tree.headSet(30));
        System.out.println("TailSet: " + tree.tailSet(10));
        System.out.println("SubSet: " + tree.subSet(10, 30));

        Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        Set<Integer> inter = new HashSet<>(A);
        inter.retainAll(B);
        Set<Integer> diff = new HashSet<>(A);
        diff.removeAll(B);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
        System.out.println("Difference: " + diff);
    }
}