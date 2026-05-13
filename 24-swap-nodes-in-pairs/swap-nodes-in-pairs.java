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
    public ListNode swapPairs(ListNode head) {

        // store values in arraylist
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // swap adjacent elements
        for (int i = 0; i < list.size() - 1; i += 2) {

            int t = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, t);
        }

        // create new linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int num : list) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}