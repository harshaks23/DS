

package  BinaryTree;
class soluton1 {
    TreeNode prev;
    TreeNode first;

    TreeNode last;

    public void recoverTree(TreeNode root) {
        if (root==null) return ;

        Helper(root);


        int temp=first.val;
        first.val=last.val;
        last.val=temp;




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
                last=node;
            }
            else
            {
                last=node;
            }


        }
        prev=node;

        Helper(node.right);

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
