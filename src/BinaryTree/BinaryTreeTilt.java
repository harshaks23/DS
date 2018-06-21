package BinaryTree;

public class BinaryTreeTilt {


    class Solution {
        int ret=0;
        public int findTilt(TreeNode root) {
            Helper(root);
            return ret;


        }
        public int Helper(TreeNode root)
        {
            if(root==null)
                return 0;

            int left=Helper(root.left);
            int right =Helper(root.right);
            ret+=Math.abs(left-right);
            System.out.println(ret);
            return left +right + root.val;

        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
