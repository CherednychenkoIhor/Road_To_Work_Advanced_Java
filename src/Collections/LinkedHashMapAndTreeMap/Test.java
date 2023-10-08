package Collections.LinkedHashMapAndTreeMap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантируется никакого порядка

        // гарантируется порядок добавления пар ключ -> значение. В каком порядке пары (ключ, значения) были добавлены, в таком порядке они и вернутся
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        Map<Integer, String> treeMap = new TreeMap<>(); // пары (ключ, значение) сортируются по ключу (естественный порядок)

        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Tom");
        map.put(15, "Mike");
        map.put(0, "Tim");
        map.put(1563, "Carl");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry :map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
