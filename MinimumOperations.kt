class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        var finalXor = 0
        for (n in nums) {
            finalXor = finalXor xor n
        }

        var count = 0
        var tempK = k
        var tempFinalXor = finalXor
        while (tempK > 0 || tempFinalXor > 0) {
            if (tempK and 1 != tempFinalXor and 1) {
                count++
            }

            tempK = tempK ushr 1
            tempFinalXor = tempFinalXor ushr 1
        }

        return count
    }
}

fun main() {
    val solution = Solution()
    println(solution.minOperations(intArrayOf(2, 0, 2, 0), 0))
}
