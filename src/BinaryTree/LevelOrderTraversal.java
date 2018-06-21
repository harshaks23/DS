package BinaryTree;

import java.util.*;

public class LevelOrderTraversal {


    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            List<List<Integer>> wrapList = new ArrayList<List<Integer>>();

            if(root == null) return wrapList;

            queue.offer(root);
            while(!queue.isEmpty()){
                int levelNum = queue.size();
                List<Integer> subList = new ArrayList<Integer>();
                for(int i=0; i<levelNum; i++) {
                    TreeNode temp= queue.poll();
                    if(temp.left != null) queue.offer(temp.left);
                    if(temp.right != null) queue.offer(temp.right);
                    subList.add(temp.val);
                }
                wrapList.add(subList);
            }
            return wrapList;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
