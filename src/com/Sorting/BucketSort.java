package com.Sorting;

public class BucketSort  {
public int max(int[] arr)
{
    int max=-1;
    for (int i:arr)
    {
        if (i>max)
            max=i;
    }
    return max;
}


    public int[] sort(int[] arr)
    {
       int max= max(arr);
       int[] bucket_array= new int[max+1];
       for (int i=0;i<bucket_array.length;i++)
       {
           bucket_array[i]=0;
       }
        for (int i=0;i<arr.length;i++)
        {
            bucket_array[arr[i]]++;
        }
int start=0;
        for ( int i=0;i<bucket_array.length;i++)
        {
            for (int j=0;j<bucket_array[i];j++)
            {
                arr[start++]=i;
            }

        }



return arr;



    }


    public static void main(String[] args) {

        int[] arr= new int[]{8,7,6,5};
        BucketSort bucketSort = new BucketSort();
        arr=bucketSort.sort(arr);
        for (int i:arr
             ) {

            System.out.println(i);
        }

    }

}
