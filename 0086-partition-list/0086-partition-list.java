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
        if(head==null || head.next==null){
            return head;
        }
        ListNode smallDummy=new ListNode(0);
        ListNode largeDummy=new ListNode(0);
        ListNode small=smallDummy;
        ListNode large=largeDummy;
        ListNode temp= head;
        while(temp!=null){
            if(temp.val<x){
                small.next=temp;
                small=small.next;
            }
            if(temp.val>=x){
                large.next=temp;
                large=large.next;
            }
            temp=temp.next;
        }
        small.next=largeDummy.next;
        large.next=null;
        return smallDummy.next;
    }
}