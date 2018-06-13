package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
//both iterative nad recursive



public class symmetric {

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            Queue<TreeNode> q = new LinkedList<>();

            q.add(root.left);
            q.add(root.right);

            while (!q.isEmpty()) {
            /* remove the front 2 nodes to
              check for equality */
                TreeNode tempLeft = q.remove();
                TreeNode tempRight = q.remove();

            /* if both are null, continue and chcek
               for further elements */
                if (tempLeft == null && tempRight == null)
                    continue;

                /* if only one is null---inequality, retun false */
                if ((tempLeft == null && tempRight != null) ||
                        (tempLeft != null && tempRight == null))
                    return false;

                if (tempLeft.val != tempRight.val)
                    return false;

                q.add(tempLeft.left);
                q.add(tempRight.right);
                q.add(tempLeft.right);
                q.add(tempRight.left);
            }

            return true;

        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution2 {
        public boolean isSymmetric(TreeNode root) {

            if (root == null) return true;
            return isSym(root.left, root.right);


        }

        public boolean isSym(TreeNode left, TreeNode right) {
            if (left == null && right == null) return true;
            if (left == null || right == null) return false;

            if (left.val != right.val) return false;
            return isSym(left.left, right.right) && isSym(left.right, right.left);
        }
    }
}