import java.util.Arrays;

public class kthlargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k ];
    }
}
