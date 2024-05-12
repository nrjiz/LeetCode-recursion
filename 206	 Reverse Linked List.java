//my solution 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }
    private ListNode reverseList(ListNode head, ListNode prev){
        if(head==null) return prev;
        ListNode nextNode =head.next;
        head.next=prev;
        return reverseList(nextNode,head);
        
    }

}
