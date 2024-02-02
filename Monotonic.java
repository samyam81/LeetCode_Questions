public class Monotonic {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
       
        boolean result=mono(arr);
        System.out.println(result);
    }

    private static boolean mono(int[] arr) {
        boolean inc=true;
        boolean dec=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                inc=false;
            }
            if (arr[i]<arr[i+1]) {
                dec=false;
            }
        }
        return (inc||dec);
    }
    
}