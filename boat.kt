import java.util.Arrays

fun main(){
    println(numRescueBoats(intArrayOf(1,2),3))
    println(numRescueBoats(intArrayOf(3,2,2,1),3))
    println(numRescueBoats(intArrayOf(3,5,3,4),5))
}
fun numRescueBoats(people: IntArray, limit: Int): Int {
    var boats:Int=0
    Arrays.sort(people)
    var i:Int=0
    var j:Int=people.size-1
    while (i<=j){
        if((people[j]+people[i])<=limit){
            i++
        }
        j--
        boats++
    }
    return boats
}
