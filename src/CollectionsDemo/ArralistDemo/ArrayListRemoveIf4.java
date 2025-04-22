package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf4 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(32);
        al.add(17);
        al.add(52);
        al.add(16);
        al.add(22);
        al.add(55);

        System.out.println(al);

        // remove the elements which are in between than 20 - 40
        // predicate symbol ->

        al.removeIf(a -> a>=20 && a<=40) ;

        System.out.println(al);



    }
}
