package BinaryTree;

public class deleteNode {

    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {

            return Helper(root,key);

        }

        TreeNode  Helper(TreeNode root,int key)
        {
            if(root==null)
                return null;


            if(root.val==key)
            {
                if(root.left==null && root.right==null)
                {

                    return null;
                }
                else
                if(root.left==null)
                {
                    return root.right;
                }
                else
                if(root.right==null)
                    return root.left;


                TreeNode temp= findSuccessor(root.right);
                root.val=temp.val;
                root.right=   Helper(root.right,temp.val);
                return root;
            }
            else

            if(key<root.val)
                root.left=   Helper(root.left,key);
            else
                root.right=Helper(root.right,key);


            return root;

        }

        public TreeNode findSuccessor(TreeNode node)
        {

            while(node.left!=null)
            {
                node= node.left;
            }

            return node;
        }
    }




    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
