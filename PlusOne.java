import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        //input
        int[] arr={4,3,2,1};
        int arrNumber=0;
        //Solution
        for(int i=0;i<=arr.length-1;i++){
            arrNumber=arrNumber*10+arr[i];
        }
        //System.out.println(arrNumber);
        arrNumber++; int i=arr.length-1;
        while (arrNumber!=0) {
            int digit=arrNumber%10;
            arr[i]=digit;
            arrNumber/=10;i--;
        }
        //Output
        System.out.println(Arrays.toString(arr));
    }
    
}