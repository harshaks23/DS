package BinaryTree;

public class DiameterOftree {


    class Solution {
        int ans=0;
        public int diameterOfBinaryTree(TreeNode root) {
            DFS(root);
            return ans;
        }

        public int DFS(TreeNode tr)
        {

            if(tr==null)
                return 0;

            int left= DFS(tr.left);
            int right= DFS(tr.right);

            ans =Math.max(ans,left+right);

            return Math.max(left,right) + 1;

        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
