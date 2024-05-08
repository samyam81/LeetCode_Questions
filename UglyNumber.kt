fun main() {
    println(isUgly(6))
    println(isUgly(1))
    println(isUgly(14))
}

    fun isUgly(n: Int): Boolean {
        if (n <= 0) return false 
        if (n == 1) return true  
        val factors = intArrayOf(2, 3, 5)
        var num = n

        factors.forEach { fac ->
            while (num % fac == 0) {
                num /= fac
            }
        }

        return num == 1
    }
