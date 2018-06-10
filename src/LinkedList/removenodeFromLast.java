package LinkedList;

public class removenodeFromLast {

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            if(head==null) return head;

            ListNode dummy = new ListNode(0);
            dummy.next=head;

            ListNode traverse = dummy;

            for(int i=0;i<n;i++)
            {
                traverse=traverse.next;
            }

            ListNode change=dummy;
            while(traverse.next!=null)
            {
                traverse=traverse.next;
                change=change.next;

            }

            change.next=change.next.next;




            return dummy.next;





        }
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
