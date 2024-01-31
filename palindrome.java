public class palindrome {
    public static void main(String[] args) {
        //Input the value
        int nums=121;
        //Solution
        boolean result=palin(nums);
        //Display the result.
        System.out.println(result);
    }

    private static boolean palin(int nums) {
       if(nums<0){return false;}
        int reversed=0;
        int temp=nums;

         while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return(reversed==nums);
    }
}
