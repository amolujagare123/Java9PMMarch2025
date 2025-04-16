package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListAddAllDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pratik");
        al.add("deepali");
        al.add("surya");
        al.add("anushka");


        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.addAll(al);

        System.out.println(al2);

    }
}
