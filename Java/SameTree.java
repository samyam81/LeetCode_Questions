
package GRAPH_THEORY;

public class SameTree {

    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null && q == null) {
            return true;
        }

        if (p!=null && q!=null && p.val==q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
        }
        return false;
    }
}
