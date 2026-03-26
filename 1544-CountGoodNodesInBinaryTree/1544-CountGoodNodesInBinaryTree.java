// Last updated: 3/26/2026, 1:48:27 AM
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
    int count;
    public int goodNodes(TreeNode root) {
        int currentMax = root.val;
        count = 0;
        getNodesCount(root,currentMax);
        return count;
    }
    
    private void getNodesCount(TreeNode root, int currentMax){
        if(root == null)
            return;
        if(root.val >=currentMax){
            count++;
            currentMax = root.val;
        }
        getNodesCount(root.left,currentMax);
        getNodesCount(root.right,currentMax);
    }
}