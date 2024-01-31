public class ReverseInt {
    public static void main(String[] args) {
        //Input
        long num=-121;
        //Solution
        long rev=reverse(num);
        //Display output
        System.out.println(rev);
    }

    private static long reverse(long num) {
        int Signbit=0;
        if(num<0)
            Signbit=1;
        long rev=0;
        num=Math.abs(num);         
        while (num != 0) {
             long digit = num % 10;
             rev = rev * 10 + digit;
             num /= 10;
         }
            return(Signbit==1)?(-rev):rev;
    }
    
}
