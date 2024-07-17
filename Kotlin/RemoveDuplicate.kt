fun main(){
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
    print(removeDuplicates(intArrayOf(1,1,2)))

}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var j:Int=1
    for(i in 1 until nums.size){
        if (nums[i]!=nums[i-1]){
            nums[j]=nums[i]
            j++
        }
    }
    return j
}
