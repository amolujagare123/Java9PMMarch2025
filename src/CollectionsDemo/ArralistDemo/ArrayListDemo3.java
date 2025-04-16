package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty());

        al.add("amol");
        al.add("pratik");
        al.add("deepali");
        al.add("surya");
        al.add("anushka");

        System.out.println(al.isEmpty());


        System.out.println(al);

        al.set(3,"sapana");

        System.out.println(al);



    }
}
