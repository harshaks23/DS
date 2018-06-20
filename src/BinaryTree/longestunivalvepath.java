package BinaryTree;

public class longestunivalvepath {


    class Solution {
        int sum=0;
        public int longestUnivaluePath(TreeNode root) {
            if(root==null) return sum;
             recur(root);
            return sum;
        }

        public int recur(TreeNode t)
        {
            if(t==null)
                return 0;
            int   left=recur(t.left);
            int right=recur(t.right);

            int actual_left_value=0,actual_right_value=0;
            if(t.left!=null && t.val==t.left.val)
                actual_left_value+= left+1;
            if(t.right!=null && t.val==t.right.val)
                actual_right_value+= right+1;


            sum =Math.max(sum,actual_left_value+actual_right_value);

            return Math.max(actual_left_value,actual_right_value);

        }
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
