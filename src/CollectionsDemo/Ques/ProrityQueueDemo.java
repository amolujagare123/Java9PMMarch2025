package CollectionsDemo.Ques;

import java.util.PriorityQueue;

public class ProrityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(73);
        pq.offer(19);
        pq.offer(42);
        pq.offer(86);
        pq.offer(31);
        pq.offer(95);
        pq.offer(27); // 19,27,31,42,73,86,95

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
