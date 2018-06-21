package BinaryTree;

public class StringfromBST {


    public class Solution {
        public String tree2str(TreeNode t) {
            return helper(t);

        }

        String helper(TreeNode t){
            if(t == null) return "";
            String res=t.val+"";

            if(t.left==null && t.right!=null)
            {
                return res+"()"+"("+ helper(t.right)+")";
            }
            if(t.left!=null && t.right==null)
            {
                return res+"("+ helper(t.left)+")";
            }
            if(t.left!=null && t.right!=null)
            {
                return res+"("+helper(t.left)+")"+"("+ helper(t.right)+")";

            }
            return res;
        }}



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
