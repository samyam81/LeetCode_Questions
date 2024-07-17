fun main() {
    println(strStr("sadbutsad", "sad"))
}

fun strStr(haystack: String, needle: String): Int {
    val hay = haystack.length
    val needlee = needle.length
    if (hay < needlee) return -1
    for (i in 0..haystack.length - needle.length) {
        var j = 0
        while (j < needle.length && haystack[i + j] == needle[j]) j++
        if (j == needle.length) {
            return i
        }
    }
    return -1
}
