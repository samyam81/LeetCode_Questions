import java.util.Arrays;
import java.util.HashSet;

public class missingnumber {

    public static void main(String[] args) {
        int array[]={1,3,5,6,7};
        Arrays.sort(array);
        int maxNumber = Arrays.stream(array).max().orElseThrow();
        HashSet <Integer> dataSet= new HashSet<Integer>();
        for (int element : array) {
             dataSet.add(element);
            }
        for(int i=0;i<=maxNumber+1;i++){
            if(!dataSet.contains(i)){
                System.out.println("the missing number is:  "+i);
            }
        }
    }
}