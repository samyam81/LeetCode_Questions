using namespace std;
class Solution {
public:
  char findTheDifference(string s, string t) {
    unordered_map<char, int> count;

    for (char c : s) {
        count[c]++;
    }

    for (char c : t) {
        count[c]--;
        if (count[c] < 0) {
            return c;
        }
    }

    return ' '; // Shouldn't reach here if the input is valid
}
};
