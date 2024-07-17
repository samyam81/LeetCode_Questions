public class maxaverage {
     public static void main(String[] args) {
        int arr[]={1,12,-6,50,3,-5};
        
       double sum= average(arr);
        System.out.println("the maximum average is: "+sum);
     }  
    private static double average(int[] arr) {
       double sum1=0;
       int k = countinteger(arr);
        for(int i=0;i<k;i++){
            sum1+=arr[i];
        }
        return sum1/k;
    }
    private static int countinteger(int[] arr) {
        int k=0;
        for(int i=0;i<6;i++){
            if(arr[i]>0){
                k++;
            }
        }
        return k;
    }
}