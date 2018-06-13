package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class minDepthLevelOrderTraversal {

    public class Solution {
        public int minDepth(TreeNode root)
        {

            if(root==null) return 0;

            Queue<TreeNode > bfs=  new LinkedList<>();
            bfs.offer(root);
            int depth=1;
            while(!bfs.isEmpty())
            {
                int size=bfs.size();
                while(size>0)
                {

                    TreeNode temp= bfs.poll();
                    if(temp==null)
                        return depth;
                    if(temp.left==null && temp.right==null)
                        return depth;
                    if(temp.left!=null)
                        bfs.offer(temp.left);

                    if(temp.right!=null)
                        bfs.offer(temp.right);
                    size--;
                }

                depth++;


            }

            return depth;


        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
