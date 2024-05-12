public class PurfectSquare {
    public boolean isPerfectSquare(int num) {
        double realvalue = Math.sqrt(num);
        return ((int) realvalue == realvalue);
    }
}
