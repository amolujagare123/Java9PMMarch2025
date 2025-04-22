package CollectionsDemo.mapsdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhs = new LinkedHashMap();
        lhs.put(102,"amol");
        lhs.put(45, "priya");
        lhs.put(67, "neha");
        lhs.put(23, "raj");
        lhs.put(23, "rani");
        System.out.println("lhs="+lhs);


        LinkedHashMap<Integer,String> lhs2 = new LinkedHashMap();
        System.out.println("lhs2="+lhs2);

        lhs2.putAll(lhs);
        System.out.println("lhs2="+lhs2);

    }
}
