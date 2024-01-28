import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        //Input
        long[] nums={1,2,3,4,5,6,7};
        int k=3;
        //displaying the output.
        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    private static long[] rotate(long[] nums, int k) {
       int n=nums.length;
       reverse(nums,0,n-1); //the arrray is completely reversed.
       reverse(nums,0,k-1); //the new array is reversed upto index 3.
       reverse(nums,k,n-1);// the new array is reversed starting from index 3.
       return nums;
    }

    private static void reverse(long[] nums, int a, int b) {
        //Reversing the array with swapping mechanism.
       while (a<b) {
            long temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;        
            a++;
            b--;
       }
    }
   
}
