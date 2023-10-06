package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("abcde");
        animals.add("frog");
        animals.add("cat");
        animals.add("bird");
        animals.add("ab");
        animals.add("dog");
        animals.add("a");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }); // Анонимный класс
        System.out.println(numbers);

        List<Human> people = new ArrayList<>();

        people.add(new Human(3, "Mike"));
        people.add(new Human(2, "Katy"));
        people.add(new Human(1, "Bob"));

        Collections.sort(people, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);
    }
}

class Human {
    private final int id;
    private final String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
            o1 > o2 => 1;
            o1 < o2 => -1;
            o1 == o2 => 0;
            compare(2, 1) => 1;
            compare(1, 2) => -1;
            compare(1, 1) => 0;
        */
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}


//class BackwardsIntegerComparator implements Comparator<Integer> {
//
//    // [5, 0, 500, 100]
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1 > o2) {
//            return -1;
//        } else if (o1 < o2) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//}
