import kotlin.math.max

fun main() {
    println(compareVersion("1.0", "1.01"))
}

fun compareVersion(version1: String, version2: String): Int {
    val v1: Array<String> = version1.split("\\.".toRegex()).toTypedArray()
    val v2: Array<String> = version2.split("\\.".toRegex()).toTypedArray()
    for (i in 0 until max(v1.size.toDouble(), v2.size.toDouble()).toInt()) {
        val num1 = if (i < v1.size) v1[i].toInt() else 0
        val num2 = if (i < v2.size) v2[i].toInt() else 0
        if (num1 < num2) {
            return -1
        }
        if (num1 > num2) {
            return 1
        }
    }
    return 0
}
