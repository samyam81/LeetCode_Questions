import java.util.*

fun main(){
    println(addedInteger(intArrayOf(9,7,5), intArrayOf(2,6,4)))

}
fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
    Arrays.sort(nums1)
    Arrays.sort(nums2)
    return nums2[0] - nums1[0]
}
