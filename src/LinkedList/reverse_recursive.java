package LinkedList;

public class reverse_recursive {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public ListNode reverseList(ListNode head) {
 
        if(head==null || head.next==null) return head;


        ListNode rec= reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return rec;








    }
}
