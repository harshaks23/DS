package com.Sorting;

public class BinarySort {
    static  int[] arr=new int[]{8,1,3,4,5,6,12};
public void sort()
{
    heapify();

    for (int i:arr
            ) {
        System.out.print(i +" ");

    }
    System.out.print("\n");

    for (int n =arr.length;n>0;n--)
    {
        int temp =arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
maxHeap(arr,0,n-1);
    }
}

public void heapify()
{
    for (int i=arr.length/2-1;i>=0;i--)
    {

        maxHeap(arr,i,arr.length);

    }

}

    public int getLeftChild(int position)

    {
        return position *2 +1 ;
    }
    public int getRightChild(int p)
    {
        return (p*2)+2;
    }

    public void swap(int[] arra,int p1,int p2)
    {
        int t=arra[p1];
        arra[p1]=arra[p2];
        arra[p2]=t;
    }
public  void maxHeap(int[] arr,int pos,int size)
{
int left=getLeftChild(pos);
int right=getRightChild(pos);
int lar;

if(left<size && arr[left] >arr[pos])
{
    lar=left;
}
else lar=pos;
if(right<size  && arr[right]>arr[lar])
{
    lar=right;
}
if (lar != pos)
{
    swap(arr,pos,lar);
    maxHeap(arr,lar,size);
}


}

    public static void main(String[] args)

    {
        System.out.println(1<<2);

        System.out.println(2<<2);
        BinarySort binarySort= new BinarySort();
        binarySort.sort();
        for (int i:arr
             ) {
            System.out.println(i);

        }

    }
}
