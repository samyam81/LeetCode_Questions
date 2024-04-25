import java.util.HashMap;

public class target {
    public static void main(String[] args) {
        System.out.println(Cansum(7, new int[] { 2, 4 },new HashMap<>()));
        System.out.println(Cansum(7, new int[] { 2, 3, 5 },new HashMap<>()));
        System.out.println(Cansum(7, new int[] { 5, 7, 4, 3 },new HashMap<>()));
        System.out.println(Cansum(300, new int[]{7,14}, new HashMap<>()));
    }

    private static boolean Cansum(int targetsum, int[] numbers, HashMap<Integer,Boolean> hashMap) {
        if (targetsum == 0)
            return true;
        if (targetsum < 0)
            return false;
        if (hashMap.containsKey(targetsum)) {
            return hashMap.get(targetsum);
        }

        for (int i : numbers) {
            int remainder=targetsum-i;
            if (Cansum(remainder, numbers, hashMap)==true) {
                hashMap.put(targetsum, true);
                return true;               
            }
        }
        hashMap.put(targetsum, false);
        return false;
    }


    // private static boolean Cansum(int targetsum, int[] numbers) {
    //     if (targetsum == 0)
    //         return true;
    //     if (targetsum < 0)
    //         return false;
    //     for (int i : numbers) {
    //         int remainder = targetsum - i;
    //         if (Cansum(remainder, numbers) == true) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
