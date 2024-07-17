fun main(){
    println(myPower(2.00000,3))
}
fun myPower(x: Double, n: Int): Double {
    var power = 1.0
    var base = x
    var exponent = n

    if (exponent < 0) {
        base = 1 / base
        exponent = -exponent
    }

    while (exponent != 0) {
        if ((exponent and 1) != 0) {
            power *= base
        }
        base *= base
        exponent = exponent ushr 1
    }

    return power
}
