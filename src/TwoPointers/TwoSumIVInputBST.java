package TwoPointers;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIVInputBST {
     // Definition for a binary tree node.
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public boolean findTarget(TreeNode root, int k) {

            Set<Integer> s= new HashSet<>();
            return tree(root,s,k);

        }

        public Boolean tree(TreeNode r,Set s,int k)
        {
            if(r==null) return false;
            if(s.contains(r.val))
                return true;
            else
                s.add(k-r.val);

            return tree(r.left,s,k) || tree(r.right,s,k);


        }

    }
}
