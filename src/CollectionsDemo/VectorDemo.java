package CollectionsDemo;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("size="+v.size()); // 0
        System.out.println("capacity="+v.capacity());// 10

        v.add("amol");
        v.add("pratik");
        v.add("deepali");
        v.add("surya");
        v.add("anushka");
        v.add("rani");
        v.add("raj");
        v.add("sham");
        v.add("raj");
        v.add("sham");
        v.add("sham");
        v.add("amol");
        v.add("pratik");
        v.add("deepali");
        v.add("surya");
        v.add("anushka");
        v.add("rani");
        v.add("raj");
        v.add("sham");
        v.add("raj");
        v.add("raj");

        System.out.println("size="+v.size()); // 20
        System.out.println("capacity="+v.capacity());// 20

        System.out.println(v);


    }
}
