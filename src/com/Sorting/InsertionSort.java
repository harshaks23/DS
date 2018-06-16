package com.Sorting;

public class InsertionSort  {

    public static void main(String[] args) {
        // write your code here
        int [] arr= new int[]{12, 11, 13, 5, 6};
        for(int i =1;i<arr.length;i++)
        {
            for(int j=i;j>0;--j)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                      arr[j-1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);}

    }
}
