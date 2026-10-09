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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode beforeLeft = dummy; 
        int l = 1;

        while (l < left) {
            beforeLeft = beforeLeft.next;
            l++;
        }

        ListNode curr = beforeLeft.next; 
        ListNode prev = null;            
        ListNode tailOfReversed = curr;  

        while (l <= right) {
            ListNode temp = curr.next; 
            curr.next = prev;          
            prev = curr;               
            curr = temp;               
            l++;
        }

        beforeLeft.next = prev;        
        tailOfReversed.next = curr;    

        return dummy.next;
    }
}
