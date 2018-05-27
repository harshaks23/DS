package CoreDS;

public class BST {
    Node root;

public class Node
    {
       Node left,right;
       int key;
       Node(int key)
       {
           this.key=key;
           left=right=null;
       }
    }

    public void insert(int key)
    {
        root= insertKey(root,key);

    }
    public Node insertKey(Node node,int key)
    {
        if ( node==null )
        {
            node= new Node(key);
            return node;
        }  else
        {
            if (key<=node.key)
                node.left=insertKey(node.left,key);
            else
                node.right=insertKey(node.right,key);
        }
        return node;
    }
public void delete(int no)
{
    if (root==null) System.out.println("empty tree");
    root= delete_node(root,no);

}
public Node delete_node(Node node,int key) {
    if (node == null)
    {
              return node;
}
    if (key<node.key) node.left=delete_node(node.left,key);
    else if (key>node.key) node.right= delete_node(node.right,key);
    else
        {
            if (node.left==null)
                return node.right;
            else if (node.right==null)
                return node.left;
            else {
               node.key= find_min_successor(node.right);
               node.right=delete_node(node.right,key);
            }
        }
        return root;
}

public int find_min_successor(Node node)
{
    int min=node.key;
    while (node.left!=null)
    {
        node=node.left;
        min=node.key;
    }

    return min;

}
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(1);
    }
}
