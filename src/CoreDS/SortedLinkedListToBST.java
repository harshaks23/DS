package CoreDS;

import java.util.ArrayList;
import java.util.List;

public class SortedLinkedListToBST {

  NodeL  L_root=null;
class NodeL
    {
        NodeL next;
       public  int data;
        NodeL(int key)
        {
            this.data= key;
        }
    }

    public void add(int no)
    {
        NodeL temp=L_root;
        if (temp == null)
        {
            //System.out.println("1");
            L_root= new NodeL(no);
        }
        else {
          //  System.out.println("2");
            NodeL t = new NodeL(no);
            while (temp.next!=null)
            {
                temp=temp.next;

            }
            temp.next=t;
        }
    }
    public  String iterate_linked_list()
    {
        StringBuilder stringBuilder= new StringBuilder();
        NodeL temp=L_root;

        while (temp!=null)
        {
            stringBuilder.append(""+temp.data+" ");
            temp=temp.next;

        }
        return stringBuilder.toString();
    }


    public int[] create_array()
    {
        List<Integer> arrayList= new ArrayList();

        NodeL temp= L_root;
        while (temp!=null)
        {
            arrayList.add(temp.data);
            temp=temp.next;

        }
        System.out.println(arrayList.toArray().getClass().getName());
    return arrayList.stream().mapToInt(i->i).toArray();
    }

    public  int[] sort_array(int[] arr)

    {

       return sort_arr_quick_sort(arr,0,arr.length-1);


    }
 public int[]  sort_arr_quick_sort(int[] arr, int low,int high)
    {
      if (low<high)
      {
          int part= partione(arr,low,high);
          sort_arr_quick_sort(arr,low,part-1);
          sort_arr_quick_sort(arr,part+1,high);
      }

    return arr;
    }

    public int partione(int[] arr,int low,int high)
    {
        int pivot= arr[high];
        int i=low,j=low;
        while (i<high && j<high)
        {
            if (arr[i]<=pivot)
            {

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j++;

            }

            else {
                i++;
            }

        }
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return j;


    }




    public static void main(String[] args) {
SortedLinkedListToBST sortedLinkedListToBST= new SortedLinkedListToBST();
sortedLinkedListToBST.add(1);
        sortedLinkedListToBST.add(2);
        sortedLinkedListToBST.add(3);
        sortedLinkedListToBST.add(4);sortedLinkedListToBST.add(5);sortedLinkedListToBST.add(6);sortedLinkedListToBST.add(7);

        System.out.println(sortedLinkedListToBST.iterate_linked_list());


        int[] arr= sortedLinkedListToBST.create_array();
//use this if it is not sorted
int [] arr_s =sortedLinkedListToBST.sort_array(arr);
for (int i=0;i<arr_s.length;i++)
{
    System.out.print(arr_s[i]+" ");


}

        sortedLinkedListToBST.convert(arr_s);

    }
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
    public Node convert_Bst(int arr[] , int low, int high)
    {

        if (low>high) return null;
        int mid=(low+high )/2;
        Node root =new Node(arr[mid]);
        root.left= convert_Bst(arr,low,mid-1);
        root.right=convert_Bst(arr,mid+1,high);
        return  root;


    }
}
