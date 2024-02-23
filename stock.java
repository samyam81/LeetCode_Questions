
public class stock {
 public static void main(String[] args) {
    int[] arr={7,1,5,3,6,4};
    int min=Integer.MAX_VALUE;
    int operationalcost=0,diff=0;
    for (int i = 0; i < arr.length; i++) {
        min=(arr[i]<min)?arr[i]:min;
        diff=arr[i]-min;
        operationalcost=(diff>operationalcost)?diff:operationalcost;
    }
    System.out.println(operationalcost);
 }   
}
