#include <string>
using namespace std;

class BinaryReduction {
public:
    int numSteps(string s) {
        int steps = 0;
        int carry = 0;

        for (int i = s.size() - 1; i > 0; --i) {
            if (s[i] == '0') {
                if (carry)
                    steps++;
            } else {
                if (!carry)
                    steps++;
                carry = 1;
            }
            steps++;
        }

        if (carry)
            steps++;

        return steps;
    }
};
