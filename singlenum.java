public class singlenum {
   public static void main(String[] args) {
    int nums[]={1,2,3,2,1,3,6};
    int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
    
   }
}