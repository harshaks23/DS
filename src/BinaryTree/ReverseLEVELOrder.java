package BinaryTree;

import java.util.*;

public class ReverseLEVELOrder {

    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
            Stack<List<Integer>> stack = new Stack<>();
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
                stack.push(subList);
            }

            while(!stack.isEmpty())
            {
                wrapList.add(stack.pop());

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
