internal class Solution {
    fun shortestPalindrome(s: String?): String {
        if (s == null || s.length == 0) {
            return ""
        }

        var shortest = s.substring(0, 1)

        for (i in 0 until s.length) {
            for (j in s.length - 1 downTo i + 1) {
                if (isPalindrome(s.substring(i, j + 1))) {
                    val substr = s.substring(i, j + 1)
                    if (substr.length < shortest.length) {
                        shortest = substr
                    }
                }
            }
        }

        return shortest
    }

    private fun isPalindrome(str: String): Boolean {
        var left = 0
        var right = str.length - 1

        while (left < right) {
            if (str[left] != str[right]) {
                return false
            }
            left++
            right--
        }

        return true
    }
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val solution = Solution()

        // Test cases
        val testCases = arrayOf("a", "ab", "aba", "abcba", "abacdfgdcaba")

        for (testCase in testCases) {
            val shortestPalindrome: String = solution.shortestPalindrome(testCase)
            println("Shortest palindrome of $testCase: $shortestPalindrome")
        }
    }
}
