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
        if(node==null){
            node= new Node(key);
            return node;}
        if (key<=node.key)
        {
            node.left=insertKey(node.left,key);
        }
        else
            node.right=insertKey(node.right,key);

        return node;
    }
public void delete(int no)
{
    if (root==null) System.out.println("empty tree");
    root= delete_node(root,no);


}
public Node delete_node(Node node,int key) {

    if (node==null)
        return node;
    if (key<root.key)
        node.left=delete_node(node.left,key);
    else if (key>root.key)
        node.right=delete_node(node.right,key);
    else
    {
        if (node.left==null)
            return node.right;
        if (node.right==null)
            return node.left;
        node.key =find_min_successor(node.right);
        node.right=delete_node(node.right,node.key);
    }
return node;
}
public int find_min_successor(Node node)
{
    int min=node.key;
    while (node!=null)
    {
        min=node.key;
        node=node.left;
    }
    return min;
}
public  void inorder()
{
    inorder_(root);
}
public void inorder_(Node node)
{
    if (node==null)
        return;
    inorder_(node.left);
    System.out.print(node.key+" ");
    inorder_(node.right);


}
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(1);
        bst.insert(3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(5);
        bst.insert(6);
        bst.inorder();
bst.delete(1);
        System.out.println("-----------");
bst.inorder();
    }
}
