class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int indexDiff, int valueDiff) {
        int n=nums.size();
        set<int> ss(nums.begin(),nums.end());

        if(valueDiff==0 && n==ss.size())
            return false;
        
        for(int i=0;i<n;i++)
            for(int j=i+1;j<i+1+indexDiff;++j){
                    if(j>=n)
                        break;
                    if(abs((long long) nums[i]- nums[j])<=valueDiff) 
                        return true;
            }
        return false;      
    }
};
