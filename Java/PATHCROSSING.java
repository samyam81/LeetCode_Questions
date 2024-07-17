import java.util.HashSet;

public class PATHCROSSING {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0"); // Mark the origin as visited
        
        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            
            // Check if the current position has been visited before
            String currentPosition = x + "," + y;
            if (visited.contains(currentPosition)) {
                return true;
            }
            
            // Mark the current position as visited
            visited.add(currentPosition);
        }
        
        // If no crossing occurs, return false
        return false;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String path1 = "NES";
        String path2 = "NESWW";
        System.out.println(solution.isPathCrossing(path1)); // Output should be false
        System.out.println(solution.isPathCrossing(path2)); // Output should be true
    }
}
