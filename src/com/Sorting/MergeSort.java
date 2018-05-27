package com.Sorting;
class  MergeSort
{
    public  void merge(int arr[],int low,int mid,int high)
    {
        int[] left_array= new int[mid-low+1];
        int[] right_array= new int[high-mid];

        for (int i=0;i<left_array.length;i++)
        {
            left_array[i]=arr[low+i];

        }
        for (int i=0;i<right_array.length;i++)
        {
            right_array[i]=arr[mid+1+i];

        }

        int i=0,j=0,k=low;
        while (i<left_array.length && j<right_array.length)
        {
            if (left_array[i]<=right_array[j])
            {
                arr[k++]=left_array[i++];
            }else
                arr[k++]=right_array[j++];
        }

        while (i<left_array.length)
        {
            arr[k++]=left_array[i++];
        }

        while (j<right_array.length)
        {
            arr[k++]=right_array[j++];
        }
    }

    public void sort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int mid= (low+ (high-low)/2);

            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);

        }
    }


     static public  void  main(String[] args)
{
    MergeSort mergeSort = new MergeSort();
    int [] arr= new int[]{5,4,3,2,1};
    mergeSort.sort(arr,0,arr.length-1);
    for (int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}
}