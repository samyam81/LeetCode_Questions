class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_map<int,int> hello;
        for(int i=0;i<nums.size();i++){
            if(hello.count(nums[i]))
                    if(i-hello[nums[i]]<=k) return true;
            hello[nums[i]]=i;
        }
        return false;
    }
};
