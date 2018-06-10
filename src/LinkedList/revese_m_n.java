package LinkedList;

public class revese_m_n {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            if (head == null || head.next == null) return head;

            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode prev = null;
            ListNode curr = dummy;
            ListNode next;

            int i = 0;

            while (i < m) {
                prev = curr;
                curr = curr.next;

                ++i;
            }

            ListNode beforeStart = prev;
            ListNode start = curr;

            while (i < n) {
                next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;

                ++i;
            }

            ListNode end = curr;
            ListNode afterEnd = curr.next;

            beforeStart.next = end;
            end.next = prev;
            start.next = afterEnd;

            return dummy.next;

        }
    }
}
