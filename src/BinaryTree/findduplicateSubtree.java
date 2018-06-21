package BinaryTree;

import java.util.*;

public class findduplicateSubtree {
    class Solution {
        Map<String,Integer> map= new HashMap<>();
        int c=0,d=0;
        int v=0;
        Map<Integer,Integer> map2= new HashMap<>();
        List<TreeNode> list = new ArrayList<>();

        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            map= new HashMap<>();
            list = new ArrayList<>();
            serialize(root);
            System.out.println(c+" "+d);
            return list;

        }

        public int serialize(TreeNode node)
        {
            c++;
            if(node==null)
                return 0;
            d++;
            String ret= node.val+","+serialize( node.left)+","+serialize(node.right);

            int  val=map.computeIfAbsent(ret,x-> ++v );
            map2.put(val,map2.getOrDefault(val,0)+1);
            if(map2.get(val)==2)
            {
                list.add(node);
            }

            return val;
        }

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
