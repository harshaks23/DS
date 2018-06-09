package LinkedList;
/*
Given a non-negative integer represented as non-empty a singly linked list of digits, plus one to the integer.

        You may assume the integer do not contain any leading zero, except the number 0 itself.

        The digits are stored such that the most significant digit is at the head of the list.

        Example:
        Input:
        1->2->3

        Output:
        1->2->4
*/

public class starPLUSoneLinked {


    public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    class Solution {
        public ListNode plusOne(ListNode head) {

            ListNode temp= new ListNode(0);
            temp.next=head;
            ListNode lastNon9Digit=null;
            ListNode traverse= temp;

            while(traverse!=null)
            {

                if(traverse.val!=9)
                {
                    lastNon9Digit=traverse;
                }

                traverse=traverse.next;
            }
            lastNon9Digit.val++;
            lastNon9Digit=lastNon9Digit.next;
            while(lastNon9Digit!=null)
            {
                lastNon9Digit.val=0;
                lastNon9Digit=lastNon9Digit.next;
            }

            if(temp.val==0) return temp.next;
            else
                return temp;
        }
    }
}
