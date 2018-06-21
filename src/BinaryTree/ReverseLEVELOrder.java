package BinaryTree;

import java.util.*;
//Just use the Stack and put it into it and rretrrive it
// Also a better thinking would be to add to arraylist based on the posiitom
//first create a list of list of size of depth of tje tree and then start the level 1 as hhest and add values baed on the level
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

    class Solution2 {
        public int getHeight(TreeNode treeNode){
            if(treeNode==null) return 0;
            else return (Math.max(getHeight(treeNode.left),getHeight(treeNode.right))+1);
        }
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> res=new ArrayList<>();
            int heigh=getHeight(root);
            levelOrderHelper(res,root,heigh-1);
            return res;
        }
        public void levelOrderHelper(List<List<Integer>> res, TreeNode node, int level){
            if(node==null){
                return;
            }
            while (res.size()<=level) res.add(new ArrayList<Integer>());
            res.get(level).add(node.val);
            levelOrderHelper(res,node.left,level-1);
            levelOrderHelper(res,node.right,level-1);

        }
    }}
