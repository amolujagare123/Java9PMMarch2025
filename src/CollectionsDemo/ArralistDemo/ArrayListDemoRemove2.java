package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListDemoRemove2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(34);
        al.add(55);
        al.add(25);
        al.add(87);

        System.out.println(al);

        Integer num = 55;

        al.remove(num);
        System.out.println(al);


       /* al.remove(2);
        System.out.println(al);*/



    }
}
