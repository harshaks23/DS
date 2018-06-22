package BinaryTree;

public class lcaBinaryTree {

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null)
                return null;
            if(p.val==root.val || q.val==root.val)
                return root;

            TreeNode left=lowestCommonAncestor(root.left,p,q);
            TreeNode right= lowestCommonAncestor(root.right,p,q);

            if(left==null && right==null)
                return null;
            if(left!=null && right!=null)
                return root;

            return left!=null?left:right;



        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
