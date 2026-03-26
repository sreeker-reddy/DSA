// Last updated: 3/26/2026, 1:49:39 AM
/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * class ImmutableListNode {
 *     public void PrintValue(); // print the value of this node.
 *     public ImmutableListNode GetNext(); // return the next node.
 * }
 */

public class Solution {
    public void PrintLinkedListInReverse(ImmutableListNode head) {
        if(head==null)
            return;
        
        PrintLinkedListInReverse(head.GetNext());
        head.PrintValue();
    }
}