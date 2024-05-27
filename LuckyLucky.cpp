#include <vector>
#include <unordered_map>

class Solution {
public:
    int findLucky(std::vector<int>& arr) {
        std::unordered_map<int, int> freq;
        
        for (int num : arr) 
            freq[num]++;
        
        int maxLucky = -1;
        
        for (const auto& pair : freq) 
            if (pair.first == pair.second) 
                maxLucky = std::max(maxLucky, pair.first);
        
        return maxLucky;
    }
};
