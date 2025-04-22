package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf1 {

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

        // remove the elements that starts with a
        // predicate symbol ->

        al.removeIf(str ->  (str.charAt(0)=='a') ) ;
        System.out.println(al);



    }
}
