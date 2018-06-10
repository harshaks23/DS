package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//using recursition ,BFS and DFS
public class DepthOfTree {


    class Solution {
        public int maxDepth(TreeNode root) {
            if(root==null)
                return 0;

            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;


        }
    }
    class Solution2 {
        public int maxDepth(TreeNode root) {

            Stack<TreeNode> nodes = new Stack<>();

            Stack<Integer> value = new Stack<>();

            nodes.push(root);
            value.push(1);
            int max=0;
            while(!nodes.isEmpty())
            {

                TreeNode node = nodes.pop();
                int val= value.pop();


                if(node==null) continue;

                if(max<val) max=val;
                nodes.push(node.left);
                value.push(val+1);
                nodes.push(node.right);
                value.push(val+1);
            }

            return max;

        }
    }


    class Solution3 {
        public int maxDepth(TreeNode root) {
            if(root==null) return 0;
            Queue<TreeNode> nodes=new LinkedList<>();

            int max=0;

            nodes.add(root);

            while(!nodes.isEmpty())
            {
                int size=nodes.size();
                for(int i=0;i<size;i++)
                {
                    TreeNode temp =nodes.poll();

                    if(temp.left!=null)
                        nodes.add(temp.left);
                    if(temp.right!=null)
                        nodes.add(temp.right);


                }

                max++;

            }


            return max;
        }
    }
    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }
}
