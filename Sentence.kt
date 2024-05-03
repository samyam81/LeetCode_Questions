fun main(){
    println(truncateSentence("Hello how are you Contestant", 3))
}

fun truncateSentence(s: String, k: Int): String {
    var result: String = ""
    var i: Int = 0
    var count = 0
    val str: CharArray = s.toCharArray()
    while (i < str.size) {
        result += str[i]
        if (str[i] == ' ') {
            count++
            if (count == k) break
        }
        i += 1
        if (i == str.size && count < k) break
    }
    return result.trim()
}
