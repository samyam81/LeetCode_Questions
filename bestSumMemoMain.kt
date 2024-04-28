fun main() {
    val result1 = bestSumMemo(7, intArrayOf(5, 3, 4, 7))
    println(result1?.joinToString(", ") ?: "Null")

    val result2 = bestSumMemo(300, intArrayOf(7, 14))
    println(result2?.joinToString(", ") ?: "Null")
}

// This is fine but isn't dynamicccc.
//fun bestSum(target: Int, numbers: IntArray): IntArray? {
//    if (target == 0) return intArrayOf()
//    if (target < 0 || numbers.isEmpty()) return null
//
//    var shortest: IntArray? = null
//
//    numbers.forEach { number ->
//        val remainder = target - number
//        val combo = bestSum(remainder, numbers)
//        if (combo != null) {
//            val combination = intArrayOf(*combo, number) // Spread operator (*) to concatenate arrays
//            if (shortest == null || combination.size < shortest!!.size) {
//                shortest = combination
//            }
//        }
//    }
//
//    return shortest
//}

    fun bestSumMemo(target:Int,numbers:IntArray,samyam:MutableMap<Int,IntArray?> = mutableMapOf()):IntArray?{
        if (target == 0) return intArrayOf()
        if (target < 0 || numbers.isEmpty()) return null
        if (samyam.containsKey(target)) return samyam[target]

        var short:IntArray?=null

        numbers.forEach { number->
            val remainder=target-number
            val result=bestSumMemo(remainder,numbers, samyam)
            if (result !=null){
                val com= intArrayOf(*result,number)
                if (short==null||
                    com.size< short!!.size){
                    short=com
                }
            }
        }
        samyam[target]=short
        return short
    }
