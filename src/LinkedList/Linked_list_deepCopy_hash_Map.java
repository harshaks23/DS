package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Linked_list_deepCopy_hash_Map {
    class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };

    public class Solution {
        public RandomListNode copyRandomList(RandomListNode head) {

            Map<RandomListNode,RandomListNode> x = new HashMap();

            RandomListNode ret = head;
            while(ret!=null)
            {
                x.put(ret,new RandomListNode(ret.label));
                ret=ret.next;
            }

            ret=head;
            while(ret!=null)
            {

                x.get(ret).next=x.get(ret.next);
                x.get(ret).random=x.get(ret.random);
                ret=ret.next;

            }
            return x.get(head);
        }
    }



}
