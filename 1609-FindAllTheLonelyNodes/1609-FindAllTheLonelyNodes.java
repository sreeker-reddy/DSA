// Last updated: 3/26/2026, 1:48:12 AM
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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        
        getSingleChild(root, result);
        return result;
    }
    
    private void getSingleChild(TreeNode root, List<Integer> result){
        if(root == null)
            return;
        if(root.left!=null && root.right==null){
           // if(isLeafNode(root.left)){
                result.add(root.left.val);
            //}
        }
        else if(root.right!=null && root.left == null){
            //if(isLeafNode(root.right)){
                result.add(root.right.val);
            //}
        }
        if(root.left!=null)
            getSingleChild(root.left,result);
        if(root.right!=null)
            getSingleChild(root.right,result);
    }
    
    private boolean isLeafNode(TreeNode node){
        return node.left == null && node.right == null;
    }
}