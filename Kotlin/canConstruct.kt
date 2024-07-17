fun main() {
    println(canConstruct("abcdef", arrayOf("abc", "def")))
    println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeee", arrayOf("aaaa", "eee")))
}

fun canConstruct(target: String, alpha: Array<String>, samyam: MutableMap<String, Boolean> = mutableMapOf()): Boolean? {
    if (target == "") return true
    if (samyam.containsKey(target)) return samyam[target]

    alpha.forEach { word ->
        val suffix: String = target.substring(word.length)
        if (canConstruct(suffix, alpha, samyam) == true) {
            samyam[target] = true
            return true
        }
    }

    samyam[target] = false
    return false
}
