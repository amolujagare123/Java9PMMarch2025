package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListDemoRemove {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty());

        al.add("amol");
        al.add("pratik");
        al.add("deepali");
        al.add("surya");
        al.add("anushka");

        System.out.println(al);

       /* al.remove("surya");
        System.out.println(al);*/


        al.remove(2);
        System.out.println(al);



    }
}
