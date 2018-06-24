package Arrays_;

import java.util.Stack;

public class BST_iterator {

 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public class BSTIterator {

        Stack<TreeNode> stack = new Stack<>();
        public BSTIterator(TreeNode root)
        {
            pushAll(root);


        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        /** @return the next smallest number */
        public int next() {
            TreeNode temp=stack.pop();
            pushAll(temp.right);
            return temp.val;

        }

        public void pushAll(TreeNode root)
        {
            while(root!=null)
            {
                stack.push(root);
                root=root.left;

            }
        }
    }

}
