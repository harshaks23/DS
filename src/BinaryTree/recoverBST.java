package BinaryTree;

public class recoverBST {

    class Solution {
        TreeNode prev;
        TreeNode first;
        TreeNode middle;
        TreeNode last;

        public void recoverTree(TreeNode root) {
            if (root==null) return ;

            Helper(root);

            if(last==null)
            {
                int temp=first.val;
                first.val=middle.val;
                middle.val=temp;
            }
            else
            {
                int temp=first.val;
                first.val=last.val;
                last.val=temp;
            }



        }

        void Helper(TreeNode node)
        {
            if(node==null)
                return ;
            Helper(node.left);

            if(prev!=null && node.val< prev.val)
            {
                if(first==null)
                {
                    first=prev;
                    middle=node;
                }
                else
                {
                    last=node;
                }


            }
            prev=node;

            Helper(node.right);

        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
