import java.util.*;
class MethodsOfQueue{
    static void bfs() {
        Queue<String> q = new LinkedList<>();
        q.offer("Root");
        q.offer("Left Child");
        q.offer("Right Child");
        System.out.println("BFS: " + q);
        while(!q.isEmpty()){
            String node = q.poll();
            System.out.println("Node: " + node);
        }
    }

    static void priorityQueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(20);
            pq.offer(5);
            pq.offer(30);
            pq.offer(10);
            System.out.println("Min-Heap " + pq);
            while(!pq.isEmpty()){
                System.out.println("Value: " + pq.poll());
            }

            PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
            max.offer(20);
            max.offer(50);
            max.offer(10);
            System.out.println("Max-Heap: " + max);
            while(!max.isEmpty()){
                System.out.println("Value: " + max.poll());
            }
        }

    public static void main(String[] args) {
        bfs();
        priorityQueue();
    }
}