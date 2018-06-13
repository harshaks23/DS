package BinaryTree;

public class PathSum {


    class Solution {


        public boolean hasPathSum(TreeNode root, int sum)
        {

            if(root==null)
                return false;
            return Helper(root,sum,0);

        }

        boolean Helper(TreeNode root, int sum ,int n)
        {
            if(root==null )
                return false;

            if(root.left==null && root.right==null  && sum==(n+root.val))
                return true;
            return Helper(root.left,sum,n+root.val) || Helper(root.right,sum,n+root.val);
        }
    }





    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
