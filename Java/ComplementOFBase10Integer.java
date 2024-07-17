package Java;

public class ComplementOFBase10Integer {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(bitwiseComplement(n));
    }

    public static int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int numBits = (int) (Math.log(n) / Math.log(2)) + 1;
        int mask = (1 << numBits) - 1;
        int complement = n ^ mask;
        return complement;
    }
}
