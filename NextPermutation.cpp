#include <vector>
#include <algorithm>

class Solution {
public:
    void nextPermutation(std::vector<int>& nums) {
        int n = nums.size();
        int i = n - 2;
        
        // Find the largest index i such that nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // If no such index exists, reverse the entire array
        if (i == -1) {
            std::reverse(nums.begin(), nums.end());
            return;
        }
        
        // Find the largest index j such that nums[j] > nums[i]
        int j = n - 1;
        while (j > i && nums[j] <= nums[i]) {
            j--;
        }
        
        // Swap nums[i] and nums[j]
        std::swap(nums[i], nums[j]);
        
        // Reverse the subarray from index i+1 to the end
        std::reverse(nums.begin() + i + 1, nums.end());
    }
};
