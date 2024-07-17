package Java;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int a_pointer = 0;
        int b_pointer = arr.length - 1;

        int area = Integer.MIN_VALUE;

        while (a_pointer <= b_pointer) {
            if (arr[a_pointer] < arr[b_pointer]) {
                area = Math.max(area, arr[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            } else {
                area = Math.max(area, arr[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }
        }
        System.out.println(area);
    }
}
