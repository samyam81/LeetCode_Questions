fun main() {
    println(isUglyNum(6))
    println(isUglyNum(1))
    println(isUglyNum(14))
}

fun isUglyNum(number: Int): Boolean? {
    if (number==1) return false
    val factors = intArrayOf(2, 3, 5)
    var num = number

    factors.forEach { fac ->
        while (num % fac == 0) {
            num /= fac
        }
    }

    return num == 1
}
