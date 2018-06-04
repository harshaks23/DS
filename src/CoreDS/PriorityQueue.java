package CoreDS;

public class PriorityQueue {
    NodePQ[] minHeap;
    int size;

    PriorityQueue(int n)
    {
        minHeap = new NodePQ[n];
        size=0;
    }

    class  NodePQ{
        String job;
        int priority;
        NodePQ(String job,int priority)
        {
            this.job=job;
            this.priority=priority;
        }

        public  String toString()
        {

            return  "Job String " + job+" proirity "+ priority;
        }
    }



    public int getParent(int pos)
    {
        if (pos%2==1)
            return pos/2;
        else
            return (pos-1)/2;
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
        if (pos>=size/2)
            return  true;
        else return false;


    }



    public  void insert(String s,int no)
    {

        minHeap[size++]=new NodePQ(s,no);
        int temp=size-1;

        while (minHeap[temp].priority<minHeap[getParent(temp)].priority)
        {
            NodePQ t= minHeap[temp];
            minHeap[temp]=minHeap[getParent(temp)];
            minHeap[getParent(temp)]=t;
            temp=getParent(temp);


        }


    }

    public  String extractMin()
    {
        NodePQ ret=minHeap[0];
        minHeap[0]=minHeap[--size];
        Heapify(0);
        return  ret.job;
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

        if (getLeft(pos)<size && minHeap[pos].priority>minHeap[getLeft(pos)].priority)
        {
            min=getLeft(pos);
        }
        else min= pos;

        if(getRight(pos)<size && minHeap[getRight(pos)].priority<minHeap[min].priority)
        {
            min=getRight(pos);
        }

        if (min!=pos)
        {
            NodePQ temp= minHeap[min];
            minHeap[min]=minHeap[pos];
            minHeap[pos]=temp;
            Heapify(min);

        }


    }



}
