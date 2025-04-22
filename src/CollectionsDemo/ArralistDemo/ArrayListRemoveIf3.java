package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf3 {

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

        // remove the elements which are less than 20
        // predicate symbol ->

        al.removeIf(x -> x<20) ;

        System.out.println(al);



    }
}
