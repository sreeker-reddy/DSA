// Last updated: 3/26/2026, 1:50:21 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum;
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null)
            return 0;
         sum = 0;
         dfs(root);
        return sum;
    }
    public void dfs(TreeNode root){
        if(root == null)
            return;
        if(root.val %2 == 0){
            if(root.left !=null){
                if(root.left.left!=null)
                    sum+=root.left.left.val;
                if(root.left.right!=null)
                    sum+=root.left.right.val;
            }
            if(root.right!=null){
                if(root.right.left!=null)
                    sum+=root.right.left.val;
                if(root.right.right!=null)
                    sum+=root.right.right.val;
            }
        }
        dfs(root.left);
        dfs(root.right);
    }
}