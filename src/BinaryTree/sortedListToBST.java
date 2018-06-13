package BinaryTree;

public class sortedListToBST {
    class Solution {
        public TreeNode sortedListToBST(ListNode head)
        {
            if(head==null) return null;
            return Helper(head);

        }

        TreeNode Helper(ListNode node)
        {
            ListNode slow=node;
            ListNode fast=node;
            ListNode prev=null;
            while(fast!=null && fast.next!=null)
            {
                prev=slow;
                fast=fast.next.next;
                slow=slow.next;
            }

            TreeNode root= new TreeNode (slow.val);
            ListNode r = slow.next;
            slow.next=null;

            if(prev!=null)
            {
                prev.next=null;
                root.left= Helper(node);
            }

            if(r!=null)
            {
                root.right = Helper(r);
            }
            return root;

        }

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
