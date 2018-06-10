package LinkedList;

public class SwapNodes {


    class Solution {
        public ListNode swapPairs(ListNode head)
        {

            if (head==null || head.next==null)
                return head;


            ListNode node1 = new ListNode (0);

            node1.next=head;

            ListNode ret=node1;
            ListNode start=head;
            ListNode next_= head.next;


            while(next_ != null )
            {

                node1.next=next_;
                ListNode temp=next_.next;
                next_.next=start;
                start.next=temp;

                if(start.next==null || start.next.next==null)
                {


                    break;
                }
                else
                {


                    node1=start;
                    next_=start.next.next;

                    start= start.next;
                }


            }

            return ret.next;

        }
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
