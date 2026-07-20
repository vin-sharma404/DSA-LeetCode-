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
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;

        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            if (curr.val < x)
                list.add(curr.val);
            curr = curr.next;
        }//[1,2,2]

        curr = head;

        while (curr != null) {
            if (curr.val >= x)
                list.add(curr.val);
            curr = curr.next;
        }//[1,2,2,4,3,5]

        curr = head;
        int idx = 0;

        while (curr != null) {
            curr.val = list.get(idx);
            idx++;
            curr = curr.next;
        }

        return head;
    }
}