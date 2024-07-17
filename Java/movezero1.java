public class movezero1 {
    public static void main(String[] args) {
         int arr[]={0,1,2,0,0,65};
         int left=0;
         int right=arr.length-1;
         while(left<right){
            if(arr[left]==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            left+=1;
            right-=1;
         }
          for(int i=0;i<6;i++){
            System.out.println(arr[i]);
        }
    }
}
