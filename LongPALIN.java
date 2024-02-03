public class LongPALIN {
    public static void main(String[] args) {
        String [] str={"abc","car","ada","racecar","cool"};
        String result=check(str);
        System.out.println(result);
    }

    private static String check(String[] str) {    
        String temp="";
         for (String word : str){
            if (isPalin(word)) {
                if (word.length() > temp.length()) {
                    temp=word;
                }
            }
         }
         return temp;
    }

    private static boolean isPalin(String str){      
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true;
        }

}
