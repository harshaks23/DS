package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class linkedlistComponents {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for(int i:G) set.add(i);
        int count=0;
        boolean prev=false;
        while(head!=null)
        {
            if(set.contains(head.val))
            {
                if(prev==true)
                {
                    prev=true;
                }
                else
                {
                    prev=true;
                    count++;

                }
            }
            else
                prev=false;


            head=head.next;
        }

        return count;
    }
}
