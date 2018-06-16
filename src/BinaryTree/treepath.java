package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class treepath {

    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> list= new ArrayList<>();
            if(root==null)
                return list;
            Helper(root,String.valueOf(root.val),list);
            return list;
        }

        void Helper(TreeNode node,String s,List<String> list)
        {
            if(node==null)
                return;
            if(node.left==null && node.right==null){
                list.add(s);
                return;

            }

            if(node.left!=null)
                Helper(node.left, s+"->"+node.left.val, list);

            if(node.right!=null)
                Helper(node.right, s+"->"+node.right.val, list);

        }
    }






    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
