package LinkedList;
// nice how reference work in linkedlisy
public class oddEven {


    public class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head==null || head.next==null)
                return head;


            ListNode odd=head;

            ListNode even= head.next;
            ListNode even2=even;


            while(even!=null && even.next!=null)
            {

                odd.next=odd.next.next;
                even.next=even.next.next;
                odd=odd.next;
                even=even.next;

            }

            odd.next=even2;
            return head;

        }
    }
}
