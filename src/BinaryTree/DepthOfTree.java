package BinaryTree;

public class DepthOfTree {


    class Solution {
        public int maxDepth(TreeNode root) {
            if(root==null)
                return 0;

            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;


        }
    }

    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }
}
