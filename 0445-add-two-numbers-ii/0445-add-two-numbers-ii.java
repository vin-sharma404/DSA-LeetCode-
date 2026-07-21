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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode dummy=new ListNode(0);
        ListNode curr1= l1;
        ListNode curr2=l2;
        ListNode prev1=null;
        ListNode prev2=null;
        while(curr1!=null ){
            ListNode next1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=next1;
        }
        while(curr2!=null){
            ListNode next2=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=next2;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(prev1!=null || prev2!=null || carry!=0){
            int sum=carry;
            if(prev1!=null){
                sum+=prev1.val;
                prev1=prev1.next;
            }
            if(prev2!=null){
                sum+=prev2.val;
                prev2=prev2.next;
            }
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
        }

        ListNode temp2=dummy.next;
        ListNode prev3=null;
        while(temp2!=null){
            ListNode next3=temp2.next;
            temp2.next=prev3;
            prev3=temp2;
            temp2=next3;
        }
        return prev3;
    }
}