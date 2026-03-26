// Last updated: 3/26/2026, 1:49:32 AM
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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root,arr,0);
    }
    
    private boolean dfs(TreeNode root , int[] arr, int index){
        if(index == arr.length-1){
            if(root == null || root.left!=null || root.right!=null)
                return false;
            return root.val == arr[index];
        }
        if(root == null || root.val!=arr[index])
            return false;
        return dfs(root.left,arr,index+1) || dfs(root.right,arr,index+1);
    }
}
