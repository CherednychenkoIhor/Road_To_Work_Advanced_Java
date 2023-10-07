package Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int index = 0;
        // Before Java 5
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            if (index == 1)
                iterator.remove();

            index++;
        }

        System.out.println(list);

        // Java 5
        for (int x : list) {
//            list.remove(1); // ConcurrentModificationException
            System.out.println(x);
        }
    }
}
