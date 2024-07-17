class Solution {
     fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()
        var maxLength = 0
        var i = 0
        var j = 0

        while (j < s.length) {
            if (!set.contains(s[j])) {
                set.add(s[j])
                maxLength = maxOf(maxLength, j - i + 1)
                j++
            } else {
                set.remove(s[i])
                 i++
            }
          }

        return maxLength
    }
}
