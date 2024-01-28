import java.util.Arrays;

public class MajorityElement {
    // there is a the element that occurs more than 1/2 times...
    //display that.
    public static void main(String[] args) {
        // Input 
        int arr[]={2,2,1,1,1,2,2};
        //Solution 
        Arrays.sort(arr);
        int mid=(arr.length+1)/2;
        //Display the output.
        System.out.println("the Majority is: "+arr[mid]);
    }
}
