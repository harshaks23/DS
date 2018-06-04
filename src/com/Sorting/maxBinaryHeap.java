package com.Sorting;

public class maxBinaryHeap {
    int[] heap;
    int size;
    maxBinaryHeap(int i)
    {
     heap=new int[i];
     size=0;


    }
    public int getLeftChild(int position)

    {
        return position *2 +1;
    }
    public int getRightChild(int p)
    {
        return (p*2)+2;
    }
    public int getParent(int pos)
    {
        if (pos%2==1)
            return pos/2;
        else
            return (pos-1)/2;
    }
    public void swap(int p1,int p2)
    {
        int t=heap[p1];
        heap[p1]=heap[p2];
        heap[p2]=t;
    }
public void insert(int no)
{
    heap[size++]=no;
    int temp=size-1;
    while (heap[temp]>heap[getParent(temp)])
    {
     swap(temp,getParent(temp));
     temp=getParent(temp);
    }
}

public int remove()
{
    int ret= heap[0];
    heap[0]=heap[--size];
    heapify(0);

 return ret;
}
public boolean isLeaf(int pos)
{
if (pos>=size/2)
    return  true;
else return false;
}

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

     for (int i =0;i<size;i++)
     {
         stringBuilder.append(heap[i]+ " ");
     }
       /* for(int i=1;i<=size/2;i++)
        {
            stringBuilder.append("Parent:"+heap[i] +" ");
            stringBuilder.append("LeftChild:"+heap[getLeftChild(i)]+" Right Child"+ heap[getRightChild(i)]).append("\n");
        }*/
return stringBuilder.toString();

    }

    public  void heapify(int temp)
{
    if (isLeaf(temp))
        return;

    int larg;
    if(getLeftChild(temp) < size && heap[temp]<heap[getLeftChild(temp)])
    {
        larg=getLeftChild(temp);
    }
    else
        larg=temp;

    if(getRightChild(temp)<size && heap[larg]<getRightChild(temp))
    {
        larg=getRightChild(temp);
    }

    if(larg!=temp)
    {
        swap(larg,temp);
        heapify(larg);
    }
   /* while (heap[temp]<heap[getLeftChild(temp)] || heap[temp]<heap[getRightChild(temp)])
    {
        if (heap[getRightChild(temp)]>heap[getLeftChild(temp)])
        {
swap(getRightChild(temp),temp);
heapify(getRightChild(temp));
        }
        else {swap(getLeftChild(temp),temp);
        heapify(getLeftChild(temp));}
    }*/
}
    public static  void main(String[] args)
    {
        maxBinaryHeap maxBinaryHeap = new maxBinaryHeap(20);
        maxBinaryHeap.insert(11);
        maxBinaryHeap.insert(2);

        maxBinaryHeap.insert(84);
        maxBinaryHeap.insert(19);
        maxBinaryHeap.insert(6);
        maxBinaryHeap.insert(22);
        maxBinaryHeap.insert(9);

        System.out.println(maxBinaryHeap.toString());
        System.out.println("The Max val is " + maxBinaryHeap.remove());

        System.out.println(maxBinaryHeap.toString());
    }
}
