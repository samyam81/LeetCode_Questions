package Java;
public class ArrangeCoin{
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        
        while (left <= right) {
            long k = (left + right) / 2;
            long curr = k * (k + 1) / 2;
            
            if (curr == n) {
                return (int)k;
            }
            
            if (curr < n) {
                left = k + 1;
            } else {
                right = k - 1;
            }
        }
        
        return (int)right; // Return the number of complete rows
    }
    
    public static void main(String[] args) {
        ArrangeCoin solution = new ArrangeCoin();
        int n = 5;
        System.out.println(solution.arrangeCoins(n)); // Output: 2
    }
}
