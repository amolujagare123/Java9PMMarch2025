package CollectionsDemo.mapsdemo;

import java.util.LinkedHashMap;

public class LinedHashMapDemo2 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhs = new LinkedHashMap();
        System.out.println(lhs.isEmpty()); // true
        lhs.put(102,"amol");
        lhs.put(45, "priya");
        lhs.put(67, "neha");
        lhs.put(23, "raj");
        lhs.put(23, "rani");

        System.out.println(lhs.isEmpty()); // false
        System.out.println("lhs="+lhs);

        System.out.println(lhs.get(45));

        lhs.remove(45);
        System.out.println("lhs="+lhs);

        System.out.println(lhs.containsKey(23));
        System.out.println(lhs.containsValue("neha"));

        System.out.println(lhs.size());

        lhs.clear();

        System.out.println(lhs);





    }
}
