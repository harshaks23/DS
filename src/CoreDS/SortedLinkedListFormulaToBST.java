package CoreDS;

//here we do bottoms up approach and try to find the leaf nodes and then to the top
//just find the length of the linked list and then use the no of nodes in left and right n/2 and n-n/2-1 to find left nodes and right nodes respectively
public class SortedLinkedListFormulaToBST {
Node Lnode;
    class  Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;

        }

    }

    public void insert(int data)
    {
        if (Lnode==null)

        {
            Lnode = new Node(data);
            return;
        }

        Node temp= Lnode;
        while (temp.next!=null)
        {

            temp=temp.next;
        }
        temp.next= new Node(data);
        return;
    }
BNode bst_root;
    class BNode
    {
        BNode left,right;
        int key;
        BNode(int  data)
        {
            key=data;
            left=right=null;
        }
    }

public void print_linked()
{
    Node tem=Lnode;
    while (tem!=null)
    {
        System.out.print(tem.data+" ");
        tem=tem.next;
    }
}
    public  void convert_()
    {
        int n= No_of_comp(Lnode);
        System.out.println("\n"+n);
        bst_root=convert_bst(n);

    }

    public BNode convert_bst(int n)
    {

        if (n<=0) return null;
        BNode left=convert_bst(n/2);
BNode bNode= new BNode(Lnode.data);
        bNode.left=left;

        Lnode=Lnode.next;
        bNode.right=convert_bst(n-n/2-1);
        return bNode;
    }
    public int No_of_comp(Node node)
    {
        int i=0;
        while (node!=null)
        {
            i++;
            node=node.next;

        }

        return i;
    }

    void InOrder()
    {
        InOrder_(bst_root);
    }

    void InOrder_(BNode node)
    {
        if (node==null)
            return ;


        InOrder_(node.left);
        System.out.println(node.key);
        InOrder_(node.right);
    }
    public static void main(String[] args) {
        SortedLinkedListFormulaToBST sortedLinkedListFormulaToBST= new SortedLinkedListFormulaToBST();
        sortedLinkedListFormulaToBST.insert(1);
        sortedLinkedListFormulaToBST.insert(2);
        sortedLinkedListFormulaToBST.insert(3);
        sortedLinkedListFormulaToBST.insert(4);
        sortedLinkedListFormulaToBST.insert(5);
        sortedLinkedListFormulaToBST.print_linked();
sortedLinkedListFormulaToBST.convert_();
sortedLinkedListFormulaToBST.InOrder();
    }
}
