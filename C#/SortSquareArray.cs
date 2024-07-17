using System;
using System.Linq;

public class Solution {
    public int[] SortedSquares(int[] nums) {
        return nums.Select(i => i * i).OrderBy(x => x).ToArray();
    }
}
