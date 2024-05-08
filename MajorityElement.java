import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majority = findMajorityElement(nums);
        System.out.println("The majority element is: " + majority);
    }
    
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
