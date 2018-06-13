package BinaryTree;
import java.util.*;
public class path_sum_iterative {

class Solution {


    public boolean hasPathSum(TreeNode root, int sum)
    {

        if(root==null) return false;
        Stack<TreeNode > stack = new Stack<>();
        Stack<Integer> sum_all = new Stack<>();
        stack.push(root);
        sum_all.push(root.val);
        while(!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            int temp= sum_all.pop();
            if(node!=null)
            {
                if(node.left==null && node.right==null && sum ==temp)
                    return true;
                if(node.left!=null)
                {
                    stack.push(node.left);
                    sum_all.push(temp+node.left.val);
                }
                if(node.right!=null)
                {
                    stack.push(node.right);
                    sum_all.push(temp+node.right.val);

                }


            }
        }

        return false;
    }
}


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
}
