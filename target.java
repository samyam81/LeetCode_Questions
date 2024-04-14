import java.util.HashMap;
import java.util.Map;

public class target {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 16};
        int target = 20;
        target t = new target();
        int[] resultIndices = t.findsoln(arr, target);
        for (int index : resultIndices) {
            System.out.print(arr[index] + " ");
        }
    }

    public static int[] findsoln(int[] arr, int target) {
        Map<Integer, Integer> comp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int com = target - arr[i];
            if (comp.containsKey(com)) {
                return new int[]{comp.get(com), i};
            }
            comp.put(arr[i], i);
        }
        return new int[0];
    }
}
