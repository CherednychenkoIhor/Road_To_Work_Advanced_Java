package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>(); // внутри не гарантируется никакого порядка

        // гарантируется порядок добавления пар ключ -> значение. В каком порядке пары (ключ, значения) были добавлены, в таком порядке они и вернутся
        Set<String> linkedHashSet = new LinkedHashSet<>();

        Set<String> treeSet = new TreeSet<>(); // пары (ключ, значение) сортируются по ключу (естественный порядок)
        // Лексикографический порядок сортировки строк
        // a < b < c
        // aa < ab ...
        // 00 < 01

        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);

        Set<Integer> hashSet2 = new HashSet<>();

        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);

        // union - объединение множеств
        Set<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);

        System.out.println(union);

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);

        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(hashSet1);
        difference.removeAll(hashSet2);

        System.out.println(difference);
    }
}
