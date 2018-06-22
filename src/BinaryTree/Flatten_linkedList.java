package BinaryTree;

public class Flatten_linkedList {


    class Solution {
        public void flatten(TreeNode root) {
            TreeNode now=root;
            while(now!=null)
            {
                TreeNode temp=now;
                if(temp.left!=null)
                {
                    temp=temp.left;
                    while(temp.right!=null)
                    {
                        temp=temp.right;
                    }

                    temp.right=now.right;
                    now.right=now.left;
                    now.left=null;
                }
                now=now.right;

            }

        }
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
