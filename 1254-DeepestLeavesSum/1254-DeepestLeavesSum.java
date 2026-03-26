// Last updated: 3/26/2026, 1:50:16 AM
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
    
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        int height =  getHeight(root);
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        int level = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(level==height)
                    sum+=temp.val;
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
        }
        
        
        return sum;
    }
    
    private int getHeight(TreeNode root){
        if(root == null)
            return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        return Math.max(left,right)+1;
    }
}