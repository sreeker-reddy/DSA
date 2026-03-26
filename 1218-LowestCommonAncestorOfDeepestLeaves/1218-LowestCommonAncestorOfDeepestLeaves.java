// Last updated: 3/26/2026, 1:50:28 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    class Pair{
        int depth;
        TreeNode node;
        public Pair( TreeNode root, int depth){
            this.depth = depth;
            this.node = root;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Pair p = helper(root);
        return p.node;
    }
    
    public Pair helper(TreeNode root){
        if(root == null)
            return new Pair(root,0);
        Pair left = helper(root.left);
        Pair right = helper(root.right);
        if(left.depth == right.depth){
            return new Pair(root, left.depth+1);
        }
        return left.depth > right.depth ? new Pair(left.node,left.depth+1) : new Pair(right.node,right.depth+1);
    }
}