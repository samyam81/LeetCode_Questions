import java.util.*

class MyStack {
    private val que: Queue<Int> = LinkedList()

    fun push(x: Int) {
        que.offer(x)
        val n = que.size

        repeat(n - 1) {
            que.offer(que.poll())
        }
    }

    fun pop(): Int {
        return que.poll() ?: -1
    }

    fun top(): Int {
        return que.peek() ?: -1
    }

    fun empty(): Boolean {
        return que.isEmpty()
    }
}

fun main() {
    val obj = MyStack()
    obj.push(1)
    obj.push(2)
    obj.push(3)

    println("Top element: ${obj.top()}") // Output: 3
    println("Pop: ${obj.pop()}") // Output: 3
    println("Top element: ${obj.top()}") // Output: 2
    println("Is empty: ${obj.empty()}") // Output: false
}
