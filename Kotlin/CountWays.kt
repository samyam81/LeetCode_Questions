fun main() {
    println(countConstruct("abcdef", arrayOf("abc", "def"), mutableMapOf()))
}

fun countConstruct(target: String, alpha: Array<String>, maymas: MutableMap<String, Int>): Int {
    if (target.isEmpty()) return 1
    if (maymas.containsKey(target)) return maymas[target] ?: 0
    var totalCount = 0
    alpha.forEach { word ->
        if (target.startsWith(word)) {
            val numWays = countConstruct(target.substring(word.length), alpha, maymas)
            totalCount += numWays
        }
    }
    maymas[target] = totalCount 
    return totalCount
}
