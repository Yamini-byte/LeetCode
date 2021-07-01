/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow=head,fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                return detectFirstNode(slow,head);
                
            }
        }
        return null;
    }
    public static ListNode detectFirstNode(ListNode slow,ListNode head){
        ListNode p1=slow,p2=slow;
        int k=1;
        while(p1.next!=p2){
            p1=p1.next;
            k++;
        }
        p1=head;
        p2=head;
        for(int i=0;i<k;i++){
            p2=p2.next;
        }
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}