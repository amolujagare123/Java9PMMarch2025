package CollectionsDemo.Ques;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque();

        adq.offer(73);
        adq.offer(19);
        adq.offer(42);
        adq.offer(86);
        adq.offer(31);
        adq.offer(95);
        adq.offer(27);

        System.out.println(adq);
        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
    }
}
