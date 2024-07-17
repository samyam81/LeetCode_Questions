import java.util.*;

class PermutationsI {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPermutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, result, currentPermutation, used);
        return result;
    }
    
    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> currentPermutation, boolean[] used) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                currentPermutation.add(nums[i]);
                used[i] = true;
                backtrack(nums, result, currentPermutation, used);
                used[i] = false;
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }
}
