class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xorResult = 0;
        
        for (int num : nums) {
            xorResult ^= num;
        }
        
        int rightmostSetBit = xorResult & -xorResult;
        
        int num1 = 0, num2 = 0;
        
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        return new int[]{num1, num2};
    }
}
