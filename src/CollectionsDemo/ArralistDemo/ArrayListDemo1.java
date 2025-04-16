package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

   /*     al.add("amol");
        al.add("pratik");
        al.add("deepali");
        al.add(34);
        al.add(5.7);
        al.add(true);
        al.add('h');*/

        System.out.println(al.size());
        System.out.println(al);

        al.remove("kishor2");

        System.out.println(al.size());
    }
}
