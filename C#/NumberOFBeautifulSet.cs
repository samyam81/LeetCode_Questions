using System;
using System.Collections.Generic;

public class NumberOFBeautifulSet
{
    private int DFS(int[] nums, int k, int i, HashSet<int> set)
    {
        if (i == nums.Length)
            return set.Count == 0 ? 0 : 1;

        var cnt = DFS(nums, k, i + 1, set);

        if (set.Contains(nums[i] - k)) return cnt;

        set.Add(nums[i]);
        cnt += DFS(nums, k, i + 1, set);
        set.Remove(nums[i]);

        return cnt;
    }

    public int BeautifulSubsets(int[] nums, int k)
    {
        Array.Sort(nums);
        return DFS(nums, k, 0, new HashSet<int>());
    }
}
