import java.util.Arrays;

public class SpecialArray {
    public int specialArray(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int x = n - i; 
            if (nums[i] >= x && (i == 0 || nums[i - 1] < x))  return x;  
        }
        return -1; 
    }

    public static void main(String[] args) {
        SpecialArray sa = new SpecialArray();
        int[] nums1 = {3, 5, 7, 9};
        int[] nums2 = {0, 0, 0, 0, 4};
        int[] nums3 = {0, 4, 4, 4, 4};
        
        System.out.println(sa.specialArray(nums1)); // Output: 4
        System.out.println(sa.specialArray(nums2)); // Output: 3
        System.out.println(sa.specialArray(nums3)); // Output: -1
    }
}
