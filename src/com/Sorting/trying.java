package com.Sorting;


import java.util.*;
import java.util.ArrayList;

public class trying {

    public static void main(String[] args) {
trying tr= new trying();
tr.start("11:00");
    }

    public void start(String s)
    {int[] a = new int[4];
        int n=0;

        for (char i:s.toCharArray()
             ) {

            if(i!=':'){a[n++]=Character.getNumericValue(i);
        }


        }
for (int i:a)
{
    System.out.println(i);
}
    }
}
