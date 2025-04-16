package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pratik");
        al.add("deepali");
        al.add("surya");
        al.add("anushka");

        System.out.println(al.size());
        System.out.println(al);


        System.out.println("for loop ......");

        for(int i=0 ; i<al.size() ; i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("for each loop ......");

        for(String str:al)
            System.out.println(str);

        System.out.println("using iterator......");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        Collections.sort(al);

        System.out.println(al);

        al.clear();
        System.out.println(al);


    }
}
