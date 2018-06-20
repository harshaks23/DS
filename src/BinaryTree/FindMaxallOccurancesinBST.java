package BinaryTree;

import java.util.*;

public class FindMaxallOccurancesinBST {

    class Solution {

        List<Integer> list= new ArrayList<>();
        int max=0;
        int count=0;
        TreeNode prev;
        public int[] findMode(TreeNode root)
        {
            if(root==null) return  new int[0];

            recur(root);
            int[] ret= new int[list.size()];
            for(int i=0;i<ret.length;i++)
            {
                ret[i]=list.get(i);
            }

            return ret;

        }

        void  recur(TreeNode node)
        {
            if(node==null)
                return;
            recur(node.left);

            if(prev!=null && prev.val==node.val)
            {
                count++;

            }else
                count=1;

            if(count>max)
            {
                max=count;
                list.clear();
                list.add(node.val);
            }
            else
            if(count==max)
                list.add(node.val);

            prev=node;
            recur(node.right);
        }
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
