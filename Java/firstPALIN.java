package Java;

public class firstPALIN {
    public static void main(String[] args) {
        String [] str={"abc","car","ada","racecar","cool"};
       
        String result=check(str);
        System.out.println(result);
    }

    private static String check(String[] str) {

        for (int i = 0; i < str.length; i++) {
            if(isPalin(str[i])){
                return str[i];
            }

        }
        return null;
    }
    
    private static boolean isPalin(String str){      
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true;
        }

}