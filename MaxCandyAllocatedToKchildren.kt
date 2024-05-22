class MaxCandyAllocatedToKchildren {
    fun maximumCandies(candies: IntArray, k: Long): Int {
        var left = 0
        var right = 10_000_000
        while (left < right) {
            var sum = 0L // var sum: Long = 0
            val mid = (left + right + 1) / 2
            for (a in candies) {
                sum += a.toLong() / mid
            }
            if (k > sum)
                right = mid - 1
            else
                left = mid
        }
        return left
    }
}

// var sum =0L bhanya O nai ho tara long datatype ma. Fancy matra ho.
