#include <iostream>
#include <vector>

using namespace std;

class PlusOne {
public:
    vector<int> plusOne(vector<int>& digits) {
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
      
        vector<int> result(digits.size() + 1, 0);
        result[0] = 1;
        return result;
    }
};

int main() {
    PlusOne plusOne;
    vector<int> digits = {9, 9, 9};
    vector<int> result = plusOne.plusOne(digits);
    for (int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }

    return 0;
}
