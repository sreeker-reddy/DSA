// Last updated: 3/26/2026, 1:49:12 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null)
            return false;
        if(head.val == root.val){
            if(containsList(head,root))
                return true;
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    
    public boolean containsList(ListNode head, TreeNode root){
        if(head == null)
            return true;
        if(root == null || head.val != root.val)
            return false;
        return containsList(head.next , root.left) || containsList(head.next, root.right);
    }
}