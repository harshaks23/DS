package BinaryTree;

public class sortedarraytoBST {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums)
        {

            TreeNode root=   Helper(nums,0,nums.length-1);
            return root;
        }

        TreeNode   Helper(int[] nums, int i,int j)
        {
            if(i>j) return null;
            int mid =( i+j)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left= Helper(nums,i,mid-1);
            node.right= Helper(nums,mid+1,j);

            return node;
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

}
