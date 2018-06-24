package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderStackSimilartoPreOrder {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            Stack<TreeNode> s= new Stack<>();

            List<Integer> l= new ArrayList<>();
            if(root==null)
                return l;
            s.push(root);
            TreeNode curr=root;
            while(!s.isEmpty())
            {
                TreeNode temp=s.pop();
                l.add(temp.val);
                if(temp.right!=null)
                {
                    s.push(temp.right);
                }
                if(temp.left!=null)

                {
                    s.add(temp.left);

                }
            }

            return l;


        }
    }
}
