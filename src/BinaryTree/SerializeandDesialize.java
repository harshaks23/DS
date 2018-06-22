package BinaryTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeandDesialize {

    public class Codec {
        String Sep=",";
        String Null_="#";
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if(root==null)
                return "";
            StringBuilder ret= new StringBuilder();
            serialize_(root,ret);
            return ret.toString();

        }
        public void serialize_(TreeNode iter,StringBuilder ret)
        {
            if(iter==null)
            {
                ret.append(Null_).append(Sep);
                return;
            }

            ret.append(String.valueOf(iter.val)).append(Sep);
            serialize_(iter.left,ret);
            serialize_(iter.right,ret);

        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.equals(""))
                return null;
            System.out.println(data);
            Queue<String> queue= new LinkedList<>();
            queue.addAll(Arrays.asList(data.split(Sep)));

            return buildTree(queue);
        }

        public TreeNode buildTree(Queue<String> queue)
        {
            String s=queue.poll();
            if(s.equals(Null_))
                return null;
            else
            {
                TreeNode x = new TreeNode(Integer.valueOf(s));
                x.left=buildTree(queue);
                x.right=buildTree(queue);
                return x;
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
