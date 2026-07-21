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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {

            int greater = 0;
            ListNode temp = curr.next;

            while (temp != null) {

                if (temp.val > curr.val) {
                    greater = temp.val;
                    break;
                }

                temp = temp.next;
            }

            ans.add(greater);
            curr = curr.next;
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}