fun main() {
    println(shortPalinn(arrayOf("racecar", "rinku", "apple")))
}

fun shortPalinn(Palincheck: Array<String>): String? {
    val myHashtable: HashMap<String, Int> = HashMap()
    Palincheck.forEach { word ->
        if (isPalin(word)) {
            myHashtable[word] = word.length
        }
    }
    var minKey: String? = null
    var minValue: Int = Int.MAX_VALUE

    for ((key, value) in myHashtable) {
        if (value < minValue) {
            minKey = key
            minValue = value
        }
    }
    return minKey
}

fun isPalin(str: String): Boolean {
    return str == str.reversed()
}

// The code below is better but upper one is emotion<3.
//fun main() {
//    println(shortPalinn(arrayOf("racecar", "rinku", "apple")))
//}
//
//fun shortPalinn(Palincheck: Array<String>): String {
//    val palindromes = Palincheck.filter { IsPalin(it) } // Filter palindromes
//    return palindromes.minByOrNull { it.length } ?: "" // Find short palindrome (or empty string if none)
//}
//
//fun IsPalin(Str: String): Boolean {
//    return Str == Str.reversed()
//}
