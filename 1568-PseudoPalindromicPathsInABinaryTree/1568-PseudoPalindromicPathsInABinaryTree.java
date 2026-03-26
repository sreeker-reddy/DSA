// Last updated: 3/26/2026, 1:48:22 AM
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
    int pathCount;
    public int pseudoPalindromicPaths (TreeNode root) {
        pathCount = 0;
        if(root == null)
            return pathCount;
        int[] count = new int[10];
        dfs(root,count);
        return pathCount;
    }
    
    private void dfs(TreeNode root, int[] count){
        if(root == null)
            return;
        count[root.val]++;
        if(isLeafNode(root)){
            int oddCount = 0;
            for(int i=0;i<count.length;i++)
            {
                if(count[i]%2!=0)
                    oddCount++;
            }
            if(oddCount <=1)
                pathCount++;
            count[root.val]--;
            return;
        }
        dfs(root.left,count);
        dfs(root.right, count);
        count[root.val]--;
        
    }
    
    private boolean isLeafNode(TreeNode root){
        return root.left ==null && root.right == null;
    }
}