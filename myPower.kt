fun main(){
    print(myPow(9,3))
}

fun myPow(x: Double, n: Int): Double {
    if (n == 0) return 1.0
    else if (n == 1) return x
    else if (n < 0) return 1 / myPow(x, -n)
    else return x * myPow(x, n - 1)
}
