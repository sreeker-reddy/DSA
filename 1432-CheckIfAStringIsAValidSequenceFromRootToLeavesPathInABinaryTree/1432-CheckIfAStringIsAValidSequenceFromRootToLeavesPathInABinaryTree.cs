// Last updated: 3/26/2026, 1:49:29 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public bool IsValidSequence(TreeNode root, int[] arr) {
        int index = 0;

        return checkSequence(root, index, arr);
    }

    private bool checkSequence(TreeNode root, int index, int[] arr)
    {
        if(root==null || index>=arr.Length || root.val!=arr[index]) return false;

        if(root.val==arr[index]) index++;

        if(root.left==null && root.right==null && arr.Length==index) return true;
        return checkSequence(root.left, index, arr) || checkSequence(root.right, index, arr);

    }
}