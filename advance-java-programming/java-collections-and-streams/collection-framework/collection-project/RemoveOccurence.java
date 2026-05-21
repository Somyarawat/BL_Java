import java.util.*;
class RemoveOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("List: " + list);

        System.out.println("Enter remove value: ");
        int value = sc.nextInt();

        while(list.contains(value)){
            list.remove(Integer.valueOf(value));
        }
        System.out.println("Updated list: " + list);
    }
}