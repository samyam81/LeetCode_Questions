// The time complexity is O(n), and the space complexity is O(n), where n is the input integer.

fun countBits(n: Int): IntArray {
    val bits = IntArray(n + 1)
    var pow = 0
    for (i in 1 until n + 1) {
        bits[i] = bits[i ushr 1] + (i and 1)
        if ((i and (i + 1)) == 0) {
            pow++
        }
    }
    return bits
}

fun main() {
    val result = countBits(5)
    println(result.joinToString())
}



