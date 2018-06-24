package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class postRoderStack {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            LinkedList<Integer> list= new LinkedList<>();
            if(root==null) return list;
            stack.push(root);
            while(!stack.isEmpty())
            {
                TreeNode temp= stack.pop();

                list.addFirst(temp.val);

                if(temp.left!=null)
                    stack.push(temp.left);
                if(temp.right!=null)
                    stack.push(temp.right);




            }
            return list;


        }
    }
}
