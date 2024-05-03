#include <iostream>
#include <vector>
#include <unordered_map>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> numIndices;
        
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            
            if (numIndices.find(complement) != numIndices.end()) {
                return {numIndices[complement], i};
            }
            
            numIndices[nums[i]] = i;
        }
        
        return {};
    }
};

int main() {
    std::vector<int> nums = {2, 7, 11, 15};
    int target = 9;

    Solution solution;

    std::vector<int> result = solution.twoSum(nums, target);

    if (result.size() == 2) {
        std::cout << "Indices: " << result[0] << ", " << result[1] << std::endl;
        std::cout << "Elements: " << nums[result[0]] << ", " << nums[result[1]] << std::endl;
    } else {
        std::cout << "No solution found!" << std::endl;
    }

    return 0;
}
