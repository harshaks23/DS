package com.Sorting;

import java.util.*;

public class Permute_All_List_Numbers
{
   static Set<Integer> sd= new HashSet<Integer>();
    static void permute(int[] a, int k)
    {
        if (k == a.length) 
        {
        String s="";
            for (int i = 0; i < a.length; i++) 
            {
             s=s+a[i];
            }int t=Integer.parseInt(s);
if(t>0 &&t<2400) {
    sd.add(t);
}

        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
 
    public static void main(String args[]) {
        int N = 4;
        int[] sequence = new int[4];
        int num=2210;
        int test=2210;
        String x="22:00";

        sequence[0] =Character.getNumericValue(x.charAt(0));
        sequence[1] =Character.getNumericValue(x.charAt(1));
        sequence[2] =Character.getNumericValue(x.charAt(3));
        sequence[3] =Character.getNumericValue(x.charAt(4));
        System.out.println("The original sequence is: ");
        for (int i = 0; i < N; i++)
            System.out.print(sequence[i] + " ");

        System.out.println("\nThe permuted sequences are: ");
        permute(sequence, 0);

        int [] arr= new int[sd.size()];
        int n=0;
        for (int i:sd
             ) {
            System.out.println(i);
            arr[n++]=i;

        }
        for(int i =1;i<arr.length;i++)
        {
            for(int j=i;j>0;--j)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
n=0;
        System.out.println("----------");
        for (int i:arr
                ) {
            System.out.println(i);


        }

        for (int i:arr
             ) {
            if(i>num)
            {
             test=i;
             break;
            }

        }
int ret=0;

        if(num==test)
        {
            ret=arr[0];
        }
        else
            ret=test;

        System.out.println(ret +" answer");
    StringBuilder stringBuilder = new StringBuilder();
int true_len=String.valueOf(ret).length();
        System.out.println(true_len);
    int len= 4- true_len;

for(int i=0;i<len;i++)

{

    System.out.println(stringBuilder);
        stringBuilder.append(0);



}
        System.out.println(stringBuilder);
stringBuilder.append(ret);
        System.out.println(stringBuilder.toString());
stringBuilder.insert(2,":");
        System.out.println(stringBuilder);

    }


}