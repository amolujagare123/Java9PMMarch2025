package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pratik");
        al.add("deepali");
        al.add("surya");
        al.add("anushka");
        al.add("rani");
        al.add("raj");
        al.add("sham");
        al.add("kiran");

        System.out.println(al);

        // remove the elements whose length is less than or equal to 4
        // predicate symbol ->

        al.removeIf(str ->  (str.length()<=4) ) ;

        System.out.println(al);



    }
}
