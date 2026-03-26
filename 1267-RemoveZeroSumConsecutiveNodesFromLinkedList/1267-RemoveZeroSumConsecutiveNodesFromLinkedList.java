// Last updated: 3/26/2026, 1:50:14 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode root = new ListNode(-1);
        ListNode current = root;
        ListNode nextCurrent = head;
        root.next = head;
        while(current!=null && nextCurrent != null){
            int sum = nextCurrent.val;
            while(nextCurrent.next!=null && sum!=0){
                nextCurrent = nextCurrent.next;
                sum+=nextCurrent.val;
            }
            if(sum==0){
                current.next = nextCurrent.next;
            }
            else{
                current = current.next;
            }
            nextCurrent = current.next;
        }
        return root.next;
    }
}