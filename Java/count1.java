package Java;

import java.util.Scanner;

public class count1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Decimal value");
        int dec=scanner.nextInt();
        int one=counting(dec);
        System.out.println("the 1 in binary is "+one);
    }

    public static int counting(int dec){
        int count=0;
        long binary=DectoBinary(dec);
        while (binary!=0) {
            long temp= binary % 10;
            if (temp==1) {
                count++;
            }
            binary/=10;
        }
        return count;
    }

    public static long DectoBinary(int dec){
        long binary = 0;
        int base = 1;

        while (dec > 0) {
            int remainder = dec % 2;
            binary += remainder * base;
            dec /= 2;
            base *= 10;
        }

        return binary;
    }

}
