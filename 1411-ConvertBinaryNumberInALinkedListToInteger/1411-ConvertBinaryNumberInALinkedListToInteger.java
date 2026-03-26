// Last updated: 3/26/2026, 1:49:37 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            n++; temp = temp.next;
        }
        int sum = 0;
        temp = head;
        n=n-1;
       // System.out.println(n);
        while(temp!=null){
            //if(temp.val==1){  
               // sum+=(2^n) * temp.val;
                sum+=Math.pow(2,n) * temp.val;
               // System.out.println(sum + ", "+temp.val + ", "+(2^n));
            //}
            n--;
            temp = temp.next;
        }
        
        return sum;
    }
}