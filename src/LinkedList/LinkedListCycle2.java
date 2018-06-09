package LinkedList;
//returning the  position  where there is intersccecioom
public class LinkedListCycle2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast)
                    break;
            }
            if (fast == null || fast.next == null)
                return null;
            ListNode start = head;
            while (start != slow) {
                slow = slow.next;
                start = start.next;
            }

            return start;

        }
    }
}