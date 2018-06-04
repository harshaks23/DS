package LinkedList;

public class remove_linkedList {

    public ListNode removeElements(ListNode head, int val) {

        ListNode ret=new ListNode(0);
        ret.next=head;
        ListNode curr=head,prev=ret;
        while(curr!=null)
        {
            if(curr.val==val) prev.next=curr.next;
            else prev=curr;
            curr=curr.next;
        }

        return ret.next;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
