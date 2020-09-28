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

        ListNode trav = head;
        ListNode prev = null;
        ListNode next = null; 
        
        while(trav != null){

            next = trav.next;
            trav.next = prev;
            prev = trav;
            trav = next;
            
        }
        
        head = prev;
        return head;
    }
}