import java.util.Stack

fun main() {
    println(findMaxK(intArrayOf(-1, 2, -3, 3)))
}

fun findMaxK(numb: IntArray): Int {
    if (numb.isEmpty()) return -1
    val myStack: Stack<Int> = Stack()
    numb.forEach { number: Int ->
        if (number > 0 && numb.contains(-number)) {
            myStack.push(number)
        }
    }
    if (myStack.isEmpty()) return -1
    return myStack.max()
}
