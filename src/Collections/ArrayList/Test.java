package Collections.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.remove(5); // [1,2, ,4,5]
        System.out.println(list);

        // проводим много удалений из нашего листа
        list = new LinkedList<>(); // При этом не забыть перенести объекты из старого массива в новый
        // ...

//        for (Integer integer : arrayList)
//            System.out.println(integer);

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

//        System.out.println(arrayList); // Has realized method toString()
//
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(99));
//
//        System.out.println(arrayList.size()); // like a .length

        // ArrayIndexOutOfBoundsException
//        int[] x = new int[3];
//
//        for (int i = 0; i < 4; i++) {
//            x[i] = 1;
//        }
    }
}
