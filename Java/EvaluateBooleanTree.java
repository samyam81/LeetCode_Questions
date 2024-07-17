package Java;

class EvaluateBooleanTree {
    public boolean evaluateTree(TreeNode root) {
         if (root == null) {
            return false; // Assuming null root represents a False condition
        }
        
        if (root.left == null && root.right == null) {
            return root.val == 1; // Leaf node
        }
        
        boolean leftResult = evaluateTree(root.left); // Fix here
        boolean rightResult = evaluateTree(root.right); // Fix here
        
        if (root.val == 2) {
            return leftResult || rightResult; // OR operation
        } else if (root.val == 3) {
            return leftResult && rightResult; // AND operation
        } else {
            return false;
        }
    }
}
