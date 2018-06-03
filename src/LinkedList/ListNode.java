package LinkedList;
class Linked_list_Rotate {

    public class ListNode {
   int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){//empty list
            return null;
        }
        
        int length = 0;
        ListNode iter = head;
        while(iter != null){
            length += 1;
            iter = iter.next;
        }
        k = k % length;
        int step = length - k;
        iter = head;
        
        //edge cases
        if(length == 0 || k == 0){
            return head;
        }
        
        //find the prev node before the start node
        while(step > 1){
            iter = iter.next;
            step -= 1;
        }
        ListNode output = iter.next;
        iter.next = null;
        iter = output;
        //move to the final node
        while(iter.next != null){
            iter = iter.next;
        }
        iter.next = head;
        
        return output;
    }

    

}