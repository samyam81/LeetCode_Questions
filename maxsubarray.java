public class maxsubarray {
    public static void main(String[] args) {
       int arr[]={-2,-3,4,-1,-2,1,5,-3};
       int MaxSoFar=arr[0];
        int MaxEnd=arr[0];
        for(int i=1;i<arr.length;i++){
            MaxEnd=(MaxEnd + arr[i] > arr[i])? MaxEnd+arr[i]:arr[i];
            MaxSoFar=(MaxSoFar>MaxEnd)?MaxSoFar:MaxEnd;
        }
        System.out.println(MaxSoFar);
        /* int sum=arr[0];
        int k=arr[0];
        for(int i=0;i<arr.length;i++){
            k=arr[i];
            for(int j=i;j<arr.length;j++){
               k=k+arr[j];
            }
            sum= (sum>k) ? sum : k;      
        }
        System.out.println(k);*/
        }
    }

