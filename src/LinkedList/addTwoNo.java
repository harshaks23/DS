package LinkedList;
//the two list arereveerse so just add them and check ther eis a carrary at the end and add it
public class addTwoNo {


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2)
        {

            if(l1==null && l2!=null) return l2;

            if(l2==null && l1!=null) return l1;

            ListNode temp = new ListNode(0);
            ListNode ret= temp;
            int carry=0,sum=0;

            while(l1!=null || l2!=null)
            {
                int p = l1==null? 0:l1.val;
                int q =l2==null? 0:l2.val;
                sum=p+q+carry;
                carry=sum/10;
                temp.next= new ListNode(sum%10);
                temp=temp.next;
                l1= l1!=null? l1.next:l1;

                l2=l2!=null? l2.next:l2;


            }

            if(carry>0) {temp.next =new ListNode(carry);temp=temp.next;}
            return ret.next;
        }
    }
}
