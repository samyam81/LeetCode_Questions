

public class Power {

    public static void main(String[] args) {
        int x=2,n=10;
        double pow = 1;
        while(n != 0){
            if((n & 1) != 0)
            pow *= x;
            x *= x;
            n >>>= 1;
        }
        System.out.println(pow);
    }
}
