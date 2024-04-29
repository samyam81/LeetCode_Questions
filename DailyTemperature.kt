import java.util.*

fun main() {
    var temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
    println(Arrays.toString(dailyTemperatures(temperatures)))
    temperatures= intArrayOf(30,40,50,60)
    println(Arrays.toString(dailyTemperatures(temperatures)))
    temperatures= intArrayOf(30,60,90)
    println(Arrays.toString(dailyTemperatures(temperatures)))
}

fun dailyTemperatures(temperatures: IntArray): IntArray {
    val stack = Stack<Int>()
    val result = IntArray(temperatures.size)
    
    for (i in temperatures.indices) {
        while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            
            val idx = stack.pop()
            result[idx] = i - idx
            
        }
        stack.push(i)
    }
    
    return result
}
