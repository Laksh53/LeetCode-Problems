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
    static public ListNode partition(ListNode head, int x) {
        ListNode lesser = new ListNode(0);
        ListNode result = lesser;
        ListNode greater = new ListNode(0);
        ListNode greaterCopy = greater;
        while (head != null) {
            if (head.val < x) {
                lesser.next = new ListNode(head.val);
                lesser = lesser.next;
            } else {
                greater.next = new ListNode(head.val);
                greater = greater.next;
            }
            head = head.next;
        }
        lesser.next = greaterCopy.next;

        return result.next;
    }
}