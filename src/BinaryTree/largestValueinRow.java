package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class largestValueinRow {

    class Solution {
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> ret = new ArrayList<>();
            if(root==null) return ret;
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);

            while(que.size()!=0)
            {
                int size= que.size();

                int max=-Integer.MIN_VALUE;
                for(int i=0;i<size;i++)
                {
                    TreeNode temp=que.poll();
                    max= temp.val>max?temp.val:max;
                    if(temp.left!=null)
                        que.add(temp.left);
                    if(temp.right!=null)
                        que.add(temp.right);
                }

                ret.add(max);

            }

            return ret;

        }
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
