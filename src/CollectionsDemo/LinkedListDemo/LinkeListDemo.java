package CollectionsDemo.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkeListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(12);
        ll.add(32);
        ll.add(17);
        ll.add(52);
        ll.add(16);
        ll.add(22);
        ll.add(55);

        System.out.println(ll);

        ll.addFirst(0);
        ll.addLast(100);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);


    }
}
