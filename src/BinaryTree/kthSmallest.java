package BinaryTree;

public class kthSmallest {


    class Solution {
        int ret;
        int count;
        public int kthSmallest(TreeNode root, int k)
        {
            count=k;
            Helper(root,k);
            return ret;
        }
        void Helper(TreeNode root,int k)
        {


            if(root.left!=null)
                Helper(root.left,k);

            count--;

            if(count==0)
            {
                ret=root.val;
                return;
            }

            if(root.right!=null) Helper(root.right,k);

            return ;
        }
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
