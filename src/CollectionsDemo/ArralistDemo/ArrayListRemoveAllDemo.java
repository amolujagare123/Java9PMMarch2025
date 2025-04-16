package CollectionsDemo.ArralistDemo;

import java.util.ArrayList;

public class ArrayListRemoveAllDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pratik");
        al.add("deepali");
        al.add("surya");
        al.add("anushka");


        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("deepali");
        al2.add("surya");
        al2.add("Aarav");
        al2.add("Isha");
        al2.add("Vikram");
        al2.add("Radhika");
        al2.add("Kavya");
        al2.add("Aditya");
        al2.add("Meera");
        al2.add("Nikhil");
        System.out.println(al2);

        al2.removeAll(al);


        System.out.println(al2);

    }
}
