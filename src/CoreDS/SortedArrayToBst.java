package CoreDS;

public class SortedArrayToBst {
    Node root;
    class Node{
        Node left,right;
        int key;
        Node (int key)
        {
            left=right=null;
            this.key=key;
        }
    }
    public void convert(int[] arr)
    {

     root=   convert_Bst(arr,0,arr.length-1);

    }
    public Node convert_Bst(int arr[] ,int low,int high)
    {

        if(low>high)
            return  null;

        int mid= low +(high-low)/2;
        Node node = new Node(   mid);
        node.left= convert_Bst(arr,low,mid-1);
        node.right=convert_Bst(arr,mid+1,high);


        return node;



    }

    void InOrder()
    {
        InOrder_(root);
    }

    void InOrder_(Node node)
    {
        if (node==null)
            return ;


        InOrder_(node.left);
        System.out.println(node.key);
        InOrder_(node.right);
    }

    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7,8};
        SortedArrayToBst sortedArrayToBst = new SortedArrayToBst();
        sortedArrayToBst.convert(arr);
        sortedArrayToBst.InOrder();
    }
}
