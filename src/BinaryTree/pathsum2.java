package BinaryTree;

import java.util.ArrayList;
import java.util.List;
// the only tricky part was have to create as new arraylist for adding it to the arraylist ,didnt know that (thought could just addd)
//then have to remove the elements as it is refernce and you will have all the traversed path
public class pathsum2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {

        List<List<Integer>> all = new ArrayList<List<Integer>>();
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            if(root==null)
                return all;

            Helper(root,sum,new ArrayList<Integer>());
            return all;
        }
        public void Helper(TreeNode root, int sum,List<Integer> each )
        {
            if(root==null)
                return ;
            each.add(root.val);
            if(root.left==null && root.right==null && root.val==sum )
            {
                all.add(new ArrayList<Integer>(each));
                return;
            }

            if(root.left!=null)
            {
                Helper(root.left,sum-root.val,each);
                each.remove(each.size()-1);

            }

            if(root.right!=null)
            {
                Helper(root.right,sum-root.val,each);
                each.remove(each.size()-1);
            }

        }
    }
}
