package LinkedList;

public class isPalindrome {


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    class Solution {
        public boolean isPalindrome(ListNode head)
        {
            ListNode fast=head,slow=head;
            while( fast !=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }

            if(fast!=null) slow=slow.next;


            ListNode rev=null;
            while(slow!=null)
            {
                ListNode temp= slow.next;
                slow.next=rev;
                rev=slow;
                slow=temp;
            }

            slow=head;

            while(rev!=null)
            {
                if(slow.val!=rev.val) return false;
                slow=slow.next;
                rev=rev.next;

            }//

            return true;
        }
    }
}
