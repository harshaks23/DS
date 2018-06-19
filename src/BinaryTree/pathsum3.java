package BinaryTree;

import java.util.*;

public class pathsum3 {


    public class Solution2 {
        public int pathSum(TreeNode root, int sum) {
            if (root == null) return 0;
            return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        }

        private int pathSumFrom(TreeNode node, int sum) {
            if (node == null) return 0;
            return (node.val == sum ? 1 : 0)
                    + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
        }
    }



    class Solution {
        Stack<Integer> stack = new Stack<>();
        int count=0;
        int s=0;
        public int pathSum(TreeNode root, int sum) {

            s=sum;
            if(root==null)
                return 0;
            pathSumFrom(root);
            return count;
        }

        public void pathSumFrom(TreeNode node )

        {

            if(node==null)
                return ;

            stack.push(node.val);
            pathSumFrom(node.left);
            pathSumFrom(node.right);

            int start=0;
            for( int i=stack.size()-1;i>=0;i--)
            {

                start+=stack.get(i);
                if(start==s)
                    count++;


            }

            stack.pop();





        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
