import java.util.ArrayList;
import java.util.Arrays;

public class Pascal {
    public static void main(String[] args) {
        int numRows = 5;  
        ArrayList<int[]> triangle = generatePascalTriangle(numRows);

        // Print Pascal's triangle
        for (int[] row : triangle) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static ArrayList<int[]> generatePascalTriangle(int numRows) {
        ArrayList<int[]> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            int[] row = new int[i + 1];
            row[0] = 1; 

            for (int j = 1; j < i; j++) {
                
                row[j] = triangle.get(i - 1)[j - 1] + triangle.get(i - 1)[j];
            }

            if (i != 0) {
                row[i] = 1; 
            }

            triangle.add(row);
        }

        return triangle;
    }
}
