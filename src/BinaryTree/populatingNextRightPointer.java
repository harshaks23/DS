package BinaryTree;

public class populatingNextRightPointer {
    public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }

    public class Solution {
        public void connect(TreeLinkNode root) {
            if(root==null)
                return ;
            TreeLinkNode temp=null;
            while(root!=null)
            {
                temp=root;
                while(temp!=null)
                {

                    if(temp.left!=null)  temp.left.next=temp.right;
                    if(temp.right!=null && temp.next!=null )
                        temp.right.next=temp.next.left;

                    temp=temp.next;
                }

                root= root.left;


            }
        }
    }
}
