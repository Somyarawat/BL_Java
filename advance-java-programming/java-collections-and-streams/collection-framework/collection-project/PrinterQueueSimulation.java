import java.util.*;
class PrinterQueueSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.println("Enter number of jobs: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Enter document name: ");
            String doc = sc.next();
            queue.add(doc);

            while(!queue.isEmpty()){
                String document = queue.poll();
                System.out.println("Printing: " + document);
            }
        }
    }
}