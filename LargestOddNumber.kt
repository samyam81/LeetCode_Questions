
fun main(){
    println(largestOddNumber("35327"))
}

//fun largestOddNumber(num: String): String {
//    if (num.isEmpty()) {
//        return ""
//    }
//
//    var largestOddDigit = -1
//    for (i in num.indices) {
//        val c = num[i].toInt() - '0'.toInt()
//        if (c % 2 == 1 && c > largestOddDigit) {
//            largestOddDigit = c
//        }
//    }
//
//    return if (largestOddDigit == -1) "" else largestOddDigit.toString()
//}

    fun largestOddNumber(num: String): String = num.dropLastWhile { it.toInt() % 2 == 0 }
