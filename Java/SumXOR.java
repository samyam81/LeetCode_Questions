class SumXOR {
   public int subsetXORSum(int[] nums) {
        return calculateXORSum(nums, 0, 0);
    }
    
    private int calculateXORSum(int[] nums, int index, int xorSum) {
        if (index == nums.length) {
            return xorSum;
        }
        
        // Include the current element in the subset
        int include = calculateXORSum(nums, index + 1, xorSum ^ nums[index]);
        
        // Exclude the current element from the subset
        int exclude = calculateXORSum(nums, index + 1, xorSum);
        
        // Return the sum of XOR totals of subsets
        return include + exclude;
    }
    
}
