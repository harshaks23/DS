package LinkedList;

public class Reverse_iteraively {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev=null;
            ListNode current=head;
            while(current!=null)
            {
                ListNode temp=current.next;
                current.next=prev;
                prev=current;
                current=temp;
            }
            return prev;}
    }}
