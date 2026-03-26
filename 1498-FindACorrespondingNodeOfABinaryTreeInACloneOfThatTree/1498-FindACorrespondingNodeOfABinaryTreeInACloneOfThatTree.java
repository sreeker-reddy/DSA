// Last updated: 3/26/2026, 1:49:09 AM
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
    Map<TreeNode,TreeNode> map = new HashMap<>();
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        //map.add(original,cloned);
       return dfs(original,cloned,target);
       // return map.get(target);
    }
    
    private TreeNode dfs(TreeNode original, TreeNode cloned,TreeNode target){
        if(original== null || cloned == null)
            return null;
        if(original == target)
            return cloned;
        //map.put(original,cloned);
        TreeNode left = dfs(original.left,cloned.left,target);
        TreeNode right = dfs(original.right,cloned.right,target);
        return left!=null ? left : right;
    }
}