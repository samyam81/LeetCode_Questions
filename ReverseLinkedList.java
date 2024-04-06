import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original linked list:");
        System.out.println(list);

        reverseLinkedList(list);

        System.out.println("Reversed linked list:");
        System.out.println(list);
    }

    // Method to reverse a linked list using temporary list
    public static void reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> tempList = new LinkedList<>();
        while (!list.isEmpty()) {
            tempList.add(list.removeLast());
        }
        list.addAll(tempList);
    }
}
