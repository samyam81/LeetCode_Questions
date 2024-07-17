class Solution {
public:
    string reversePrefix(string word, char ch) {
    int idx = word.find(ch) + 1;
    std::string prefix = word.substr(0, idx);
    std::reverse(prefix.begin(), prefix.end());
    return prefix + word.substr(idx);
    }
};
