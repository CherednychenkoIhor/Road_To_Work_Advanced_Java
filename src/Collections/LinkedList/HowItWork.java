package Collections.LinkedList;

public class HowItWork {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(5);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
