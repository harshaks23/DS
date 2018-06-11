package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
// both recursive and iteerative usinf BFS
public class IdenticalTree {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q)
        {

            if(p==null && q==null)
                return true;

            if( (p!=null && q==null ) || (q!=null && p==null))
                return false;
            if (p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right) )
                return true;
            else
                return false;

        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    class Solution2 {
        public boolean isSameTree(TreeNode p, TreeNode q)
        {
            if(p==null && q==null) return true;
            if(p==null || q==null) return false;

            Queue<TreeNode> node1 = new LinkedList<>();
            Queue<TreeNode> node2 = new LinkedList<>();


            node1.add(p);
            node2.add(q);

            while(!node1.isEmpty() && !node1.isEmpty() )
            {
                TreeNode first=node1.poll();
                TreeNode sec=node2.poll();

                if(first.val!=sec.val)
                    return false;

                if(first.left!=null && sec.left!=null)
                {
                    node1.add(first.left);
                    node2.add(sec.left);

                }
                else
                {
                    if(first.left==null && sec.left!=null || sec.left==null && first.left!=null)
                        return false;
                }

                if(first.right!=null && sec.right!=null)
                {
                    node1.add(first.right);
                    node2.add(sec.right);

                }
                else
                {
                    if(first.right==null && sec.right!=null || sec.right==null && first.right!=null)
                        return false;
                }



            }



            return true;

        }
    }
}
