import java.util.Arrays;

public class MaxProduct {
    public int MaximumProduct(int[] nums) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("Array length must be at least 3.");
        }
        int maxProduct = Integer.MIN_VALUE;
        Arrays.sort(nums);
        
        maxProduct = Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], 
                              nums[0] * nums[1] * nums[nums.length - 1]);
        
        return maxProduct;
    }
}
