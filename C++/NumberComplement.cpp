class Solution {
public:
    int findComplement(int n) {
        int no=floor(log2(n))+1;
        return ((1LL << no) -1) ^ n;
    }
};
