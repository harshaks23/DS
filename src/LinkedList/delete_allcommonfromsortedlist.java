package LinkedList;

public class delete_allcommonfromsortedlist {


    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null) return head;
        ListNode temp= new ListNode(0);
        ListNode ret=temp;
        temp.next=head;
        ListNode  current=head;
        ListNode next;
        while(current!=null && current.next!=null)
        {
            next=current.next;
            while(next != null && current.val == next.val)
            {
                next=next.next;

            }

            if(current.next!=next)
            {
                temp.next=next;
                current=next;
            }
            else
            {
                temp=current;
                current=next;
            }
        }


        return ret.next;

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
