package com.Sorting;


public class quicksort {
    public int partione(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int k=low;
        for(int i=low;i<high;i++)
        {
            if (arr[i]<=pivot)
            {
                int temp =arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
        int temp =arr[high];
        arr[high]=arr[k];
        arr[k]=temp;
        return k;


    }
    public  void  sort(int[] arr,int low,int high)

    {
        if (low<high)
        {
            int part= partione(arr,low,high);
            sort(arr,low,part-1);
            sort(arr,part+1,high);
        }

    }


    static public void main(String[] ma)
    {
        int[] x= new int[]{6,5,3,2};
        quicksort q= new quicksort();
        q.sort(x,0,x.length-1);
        for (int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }
}
