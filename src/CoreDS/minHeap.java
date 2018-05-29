package CoreDS;

public class minHeap {
int[] minHeap;
int size;
minHeap(int n)
{
    minHeap= new int[n];
    size=0;
}
public int getParent(int pos)
{
    return pos/2;

}
public int getLeft(int pos)
{
    return (pos*2)+ 1;
}


    public int getRight(int pos)
    {
        return (pos*2)+ 2;
    }

public boolean isLeaf(int pos)
{
    return pos>(size);
}
public  void insert(int no)
{
    minHeap[size++]=no;
    int temp=size-1;
    while (minHeap[temp]<minHeap[getParent(temp)])
    {
        int t= minHeap[temp];
        minHeap[temp]=minHeap[getParent(temp)];
        minHeap[getParent(temp)]=t;
        temp=getParent(temp);


    }


}

public  int extractMin()
{
    int ret=minHeap[0];
    minHeap[0]=minHeap[--size];
    Heapify(0);
return  ret;
}

public void delete(int pos)
{
    Heapify(pos );
}

public void  Heapify(int pos)
{
if (isLeaf(pos))
    return;

int min;

if (getLeft(pos)<size && minHeap[pos]>minHeap[getLeft(pos)])
{
        min=getLeft(pos);
}
else min= pos;

if(getRight(pos)<size && minHeap[getRight(pos)]<minHeap[min])
{
    min=getRight(pos);
}

if (min!=pos)
{
    int temp= minHeap[min];
    minHeap[min]=minHeap[pos];
    minHeap[pos]=temp;
    Heapify(min);

}


}



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i =0;i<size;i++)
        {
            stringBuilder.append(minHeap[i]+ " ");
        }
       /* for(int i=1;i<=size/2;i++)
        {
            stringBuilder.append("Parent:"+heap[i] +" ");
            stringBuilder.append("LeftChild:"+heap[getLeftChild(i)]+" Right Child"+ heap[getRightChild(i)]).append("\n");
        }*/
        return stringBuilder.toString();

    }



    public static void main(String[] args) {

        CoreDS.minHeap m = new minHeap(10);
        m.insert(1);
        m.insert(2);
        m.insert(4);
        m.insert(5);
        m.insert(6);
        m.insert(3);

        System.out.println(m);
        System.out.println(  m.extractMin());
m.delete(1);
        System.out.println(m);
        m.insert(-1);

        System.out.println(m);

    }
}
