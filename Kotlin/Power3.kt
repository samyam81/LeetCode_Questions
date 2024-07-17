fun main() {
    println(isPowerOfThree(45))
}

fun isPowerOfThree(n: Int): Boolean {
    if (n <= 0)
        return false
    if (n == 1)
        return true
    if (n % 3 != 0)
        return false
    return isPowerOfThree(n / 3)
}
