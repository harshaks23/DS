package LinkedList;

public class ReorderList {


    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        {  }
        else{
            ListNode slow=head;
            ListNode fast=head;
            ListNode prev=slow;

            while(fast!=null && fast.next!=null)
            {
                prev=slow;
                fast=fast.next.next;
                slow=slow.next;

            }

            if(fast!=null)
            {prev=slow;
                slow=slow.next;
            }

            prev.next=null;
            ListNode rev=null;
            while(slow!=null)
            {
                ListNode temp=slow.next;
                slow.next=rev;
                rev=slow;
                slow=temp;
            }


            slow=head;
            while(rev!=null)
            {

                ListNode temp_rev=rev.next;
                rev.next=slow.next;

                slow.next=rev;

                slow=rev.next;

                rev=temp_rev;


            }

        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
