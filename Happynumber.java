public class Happynumber {
    public static void main(String[] args) {
        int num=7;
        boolean result=happy(num);
        System.out.println(result);
    }

    private static boolean happy(int num) {
     int sum=0;
     while (num!=0) {
              int temp=num %10;
              sum=sum+(temp*temp);  
              num/=10;   
     }
     if (sum<10) {
        if (sum==1) {
                return true;           
        } 
     } else{
        return happy(sum);
     }
        return false;
    }
    
}
