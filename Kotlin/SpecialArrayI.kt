class SpecialArrayI {
    fun isArraySpecial(nums: IntArray): Boolean {
        
        for (i in 0 until nums.size - 1) {

            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false  
            }
        }
        return true  
    }
}
