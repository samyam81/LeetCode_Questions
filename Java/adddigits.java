package Java;
public class adddigits {
    public static void main(String[] args) {
        int num=83;
        int result= add(num);
        System.err.println(result);
    }

    private static int add(int num) {
    //    int sum=0;
    //    while (num < 10) {
    //         int temp=num%10;
    //         sum=sum+temp;
    //         num/=10;
    //    }
    //    return sum;
       if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
}
