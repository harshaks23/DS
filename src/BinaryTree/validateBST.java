package BinaryTree;

import java.util.Stack;

public class validateBST {

    class Solution {
        public boolean isValidBST(TreeNode root) {
            if (root == null) return true;
            Stack<TreeNode> stack = new Stack<>();
            TreeNode prev = null;
            while(root!=null || !stack.isEmpty())
            {
                while(root!=null)
                {
                    stack.push(root);
                    root=root.left;
                }

                root=stack.pop();
                if(prev!=null && prev.val>=root.val)
                    return false;
                prev=root;
                root=root.right;

            }
            return true;
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    class Solution2 {
        public boolean isValidBST(TreeNode root) {
            if (root == null) return true;
            return Helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
        }

        boolean Helper(TreeNode root,long min,long max)
        {
            if(root==null)
                return true;
            if(root.val<=min || root.val>=max)
                return false;
            return Helper(root.left,min,root.val)   && Helper(root.right,root.val,max);
        }
    }
}
