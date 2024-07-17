#include <vector>
#include <random>
#include <algorithm> // for std::shuffle
using namespace std;

class ShuffleArray {
private:
    vector<int> original;
    default_random_engine rng; // Random number generator
public:
    ShuffleArray(vector<int>& nums) : original(nums), rng(random_device{}()) {
    }
    
    vector<int> reset() {
        return original;
    }
    
    vector<int> shuffle() {
        vector<int> shuffled = original;
        // Use Fisher-Yates shuffle algorithm
        shuffle(begin(shuffled), end(shuffled), rng);
        return shuffled;
    }
};
