package LinkedList;

public class delete_node {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 //delete a node (except the tail) in a singly linked list, given only access to that node.
    class Solution {
        public void deleteNode(ListNode node)

        {

            node.val = node.next.val;
            node.next=node.next.next;





        }
    }
}
