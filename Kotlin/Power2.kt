fun main() {
    println(isPowerOfTwo(1))
    println(isPowerOfTwo(3))
    println(isPowerOfTwo(16))

}

fun isPowerOfTwo(n: Int): Boolean {
    if (n <= 0)
        return false
    if (n == 1)
        return true
    if (n % 2 != 0)
        return false
    return isPowerOfTwo(n / 2)
}
