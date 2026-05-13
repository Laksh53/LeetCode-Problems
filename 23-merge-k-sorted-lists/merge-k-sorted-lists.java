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
    static public ListNode sort(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(0);
        ListNode temp = curr;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode n = new ListNode(l1.val);
                temp.next = n;
                l1 = l1.next;
            } else {
                ListNode n = new ListNode(l2.val);
                temp.next = n;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return curr.next;
    }

    static public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            result = sort(result, lists[i]);
        }
        return result;
    }
}