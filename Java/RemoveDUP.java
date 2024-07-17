import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RemoveDUP {
    // Remove duplicates from a sorted/unsorted linked list.
   /*  public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 6};
        int[] result = remove(number);
        System.out.println(Arrays.toString(result));
    }

    public static int[] remove(int[] number) {

        if (number.length == 0) {
            return new int[0];
        }

        Map<Integer, Integer> hash = new HashMap<>();
        int count = 0;

        for (int num : number) {
            if (!hash.containsKey(num)) {
                number[count++] = num;
                hash.put(num, 1);
            }
        }
        return Arrays.copyOf(number, count);
    } */
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] array = {1,1, 2, 3, 4, 5};
        for (int value : array) {
            linkedList.add(value);
        }
        LinkedList<Integer> result = removeDuplicates(linkedList);
        System.out.println("Result: " + result);
    }

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> numbers) {

        Map<Integer, Integer> hash = new HashMap<>();
        LinkedList<Integer> result = new LinkedList<>();

        for (int num : numbers) {
            if (!hash.containsKey(num)) {
                result.add(num);
                hash.put(num, 1);
            }
        }
        return result;
    }
}


