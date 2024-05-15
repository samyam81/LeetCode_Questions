class UglyNumberII {
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(uglyNumbers[i2] * 2, Math.min(uglyNumbers[i3] * 3, uglyNumbers[i5] * 5));
            uglyNumbers[i] = nextUgly;

            if (nextUgly == uglyNumbers[i2] * 2)
                i2++;
            if (nextUgly == uglyNumbers[i3] * 3)
                i3++;
            if (nextUgly == uglyNumbers[i5] * 5)
                i5++;
        }

        return uglyNumbers[n - 1];
    }
}
