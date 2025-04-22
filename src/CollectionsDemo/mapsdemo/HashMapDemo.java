package CollectionsDemo.mapsdemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hs = new HashMap();
        hs.put(102,"amol");
        hs.put(45, "priya");
        hs.put(67, "neha");
        hs.put(23, "raj");
        hs.put(23, "rani");
        hs.put(91, true);
        hs.put('s', 500);
        hs.put("aaa", 300);
        hs.put(true, 750);
        hs.put(88, false);
        hs.put(81, null);
        hs.put(82, null);
        hs.put(null, false);
        hs.put(null, 23);

        System.out.println(hs);

    }
}
