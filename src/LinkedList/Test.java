package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // all methods the same as ArrayList
        List<Integer> linkedList = new LinkedList<>();
        // LinkedList
        // list.add(i);
        // [1] -> [2] -> [3] -> [4] -- каждый элемент называется узлом. В каждом узле есть само значение
        // и ссылка на следующий узел.
        // При list.get(i), нужно дойти до этого элемента, это занимает время.
        // list.add(0, i);
        // head -> [1] -> [2] -> [3] -> [4] list.add(0, 5)
        // head -> [5] -> [1] -> [2] -> [3] -> [4]

        List<Integer> arrayList = new ArrayList<>();
        // ArrayList
        // list.add(i);
        // [1][2][3][4][5] -> [1][2][3][4][5][6]
        // list.add(i);
        // [1][2][3][4][5] -> [6][1][2][3][4][5] -> [7][6][1][2][3][4][5]

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        // list.add(0, 1); LinkedList faster
        // [] -> [0] -> [1][0] -> [2][1][0]...
        // list.add(i); ArrayList faster
        // [] -> [0] -> [0][1] -> [0][1][2]...

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
