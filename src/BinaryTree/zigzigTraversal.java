package BinaryTree;

import java.util.*;

public class zigzigTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

            List<List<Integer>> res = new ArrayList<>();
            if (root == null) return res;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean zigzag = false;
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int cnt = queue.size();
                for (int i = 0; i < cnt; i++) {
                    TreeNode node = queue.poll();
                    if (zigzag) {
                        level.add(0, node.val);
                    }
                    else {
                        level.add(node.val);
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                res.add(level);
                zigzag = !zigzag;
            }
            return res;

        }
    }

    //not required this solition ,use the above using ququw

    class Solution1 {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            Stack<TreeNode > s1= new Stack<>();
            Stack<TreeNode > s2= new Stack<>();
            List<List<Integer>> l= new ArrayList<>();
            if(root==null) return l;
            s1.push(root);
            while(!s1.isEmpty() || !s2.isEmpty())
            {List <Integer> tp = new ArrayList<>();
                while(!s1.isEmpty())
                {
                    TreeNode  temp= s1.pop();
                    tp.add(temp.val);

                    if(temp.left!=null)  s2.push(temp.left);
                    if(temp.right!=null)   s2.push(temp.right);

                }

                if(!tp.isEmpty()) l.add(tp);
                tp = new ArrayList<>();
                while(!s2.isEmpty())
                {
                    TreeNode temp=s2.pop();
                    tp.add(temp.val);

                    if(temp.right!=null)  s1.push(temp.right);
                    if(temp.left!=null)    s1.push(temp.left);

                }

                if(!tp.isEmpty())      l.add(tp);
            }

            return l;


        }
    }
}
