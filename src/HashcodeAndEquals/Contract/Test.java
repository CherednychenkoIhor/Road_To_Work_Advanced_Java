package HashcodeAndEquals.Contract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // Только уникальные ключи (Такого не может быть -- 1 -> "Hello", 1 -> "asd")

        map.put("Bob", 25);
        map.put("Kate", 15);
        map.put("BilL", 40);

        Set<String> set = new HashSet<>(); // только уникальные значения
        // Значения в HashSet это ключи в HashMap (map = new HashMap<>();)

        System.out.println(map);
    }
}
