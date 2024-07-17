import java.util.*

class MyQueue() {
    private val stack1 = Stack<Int>()
    private val stack2 = Stack<Int>()

    fun push(x: Int) {
        stack1.push(x)
    }

    fun pop(): Int {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        return stack2.pop()
    }

    fun peek(): Int {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        return stack2.peek()
    }

    fun empty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }
}

fun main() {
    val obj = MyQueue()
    obj.push(1)
    obj.push(2)
    obj.push(3)

    println("Queue peek: ${obj.peek()}")
    println("Dequeue: ${obj.pop()}")
    println("Queue peek: ${obj.peek()}")
}
