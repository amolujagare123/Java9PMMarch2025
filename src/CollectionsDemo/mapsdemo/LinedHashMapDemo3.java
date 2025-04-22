package CollectionsDemo.mapsdemo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinedHashMapDemo3 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap();

        lhm.put(102,"amol");
        lhm.put(45, "priya");
        lhm.put(67, "neha");
        lhm.put(23, "raj");

        System.out.println(lhm);

        Set<Integer> keySet = lhm.keySet();
        Collection<String> values = lhm.values();
        Set entrySet = lhm.entrySet();

        System.out.println("keySet="+keySet);
        System.out.println("values="+values);
        System.out.println("entrySet="+entrySet);

    }
}
