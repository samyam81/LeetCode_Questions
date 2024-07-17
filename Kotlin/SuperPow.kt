import java.math.BigInteger

fun main() {
    println(superPow(2, intArrayOf(1, 0)))
}

fun superPow(a: Int, b: IntArray): Int {
    val str = StringBuilder()
    for (i in b.indices) {
        str.append(b[i].toString())
    }
    val f: String = str.toString()
    val expo: BigInteger = BigInteger(f)
    val base: BigInteger = BigInteger.valueOf(a.toLong())
    val result: BigInteger = base.modPow(expo, BigInteger.valueOf(1337))
    return result.intValueExact()
}
