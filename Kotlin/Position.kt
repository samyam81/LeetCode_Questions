class Solution {
fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return 0

    for (i in nums.indices) {
        if (nums[i] >= target) {
            return i
        }
    }
    return nums.size
}
}
