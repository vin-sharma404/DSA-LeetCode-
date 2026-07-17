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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        int n = arr.size();
        k =k%n;

        if (k == 0){
            return head;
        }

        int[] rotate = new int[n];

        for (int i = 0; i < n; i++) {
            rotate[(i + k) % n] = arr.get(i);
        }

        temp = head;
        int idx = 0;
        while (temp != null) {
            temp.val = rotate[idx];
            idx++;
            temp = temp.next;
        }

        return head;
    }
}