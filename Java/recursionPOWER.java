public class recursionPOWER {
    public static void main(String[] args) {
        int num=23;
        int pow=2;
        int result=power(num,pow);
        System.out.println(result);
    }
    
    public static int power(int num, int pow){
        if (pow==0) {
            return 1;
        }
        else{
            return num*power(num,pow-1);
        }
    }
}
