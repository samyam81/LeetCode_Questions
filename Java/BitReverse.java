package Java;

public class BitReverse {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Left-Shift 
            result |= (n & 1); // and && or
            n >>= 1; //Right-Shift
        }
        return result;
    }
}
