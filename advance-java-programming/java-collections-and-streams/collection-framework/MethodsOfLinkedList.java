import java.util.*;
class MethodsOfLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.addFirst("A");
        ll.addLast("E");
        System.out.println("List: " + ll);
        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());


        ll.offer("F");
        ll.offerFirst("Z");
        ll.offerLast("G");
        System.out.println("After Offer: " + ll);

        System.out.println("First element: " + ll.pollFirst());
        System.out.println("Last element: " + ll.pollLast());
        System.out.println("Final List: " + ll);


        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Stack Pop:" + stack.pop());
    }
}