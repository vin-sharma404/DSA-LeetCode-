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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return null;

        HashMap<Integer, Integer> map = new HashMap<>();

        ListNode temp = head;

        // Count frequency
        while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }

        ArrayList<Integer> list = new ArrayList<>();

        temp = head;

        // Store only unique values
        while (temp != null) {
            if (map.get(temp.val) == 1) {
                list.add(temp.val);
            }
            temp = temp.next;
        }

        if (list.size() == 0)
            return null;

        temp = head;
        ListNode prev = null;

        // Overwrite existing nodes
        for (int i = 0; i < list.size(); i++) {
            temp.val = list.get(i);
            prev = temp;
            temp = temp.next;
        }

        // Remove extra nodes
        prev.next = null;

        return head;
    }
}