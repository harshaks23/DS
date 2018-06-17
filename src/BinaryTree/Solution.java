package BinaryTree;

import java.util.HashSet;
import java.util.Set;

class Solution {
   static Set<Integer> set_= new HashSet<Integer>();

    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.nextClosestTime("11:01"));
        int [] arr= new int[set_.size()];
        int n=0;
        System.out.println(set_.size()+"size");
        for (int i:set_
                ) {
            System.out.println(i);
            arr[n++]=i;

        }

    }

    public String nextClosestTime(String time) {
        char[] arr = (time.split(":")[0]+time.split(":")[1]).toCharArray();
        char min = '2';
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        String result = min+""+min+":"+min+""+min;

        int minDiff = 24*3600;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                for(int k = 0; k < arr.length; k++){
                    for(int l = 0; l < arr.length; l++){
                        if(Integer.parseInt(arr[i]+""+arr[j]) <= 23 && Integer.parseInt(arr[k]+""+arr[l]) <= 59){
                            String newtime = arr[i]+""+arr[j]+":"+arr[k]+""+arr[l];
                            String new_ = arr[i]+""+arr[j]+":"+arr[k]+""+arr[l];
                            set_.add(Integer.parseInt(new_));

                        }
                    }
                }
            }
        }

        return result;
    }

    public int timeDiff(String base, String time){
        int h1 = Integer.parseInt(base.split(":")[0]);
        int h2 = Integer.parseInt(time.split(":")[0]);
        int m1 = Integer.parseInt(base.split(":")[1]);
        int m2 = Integer.parseInt(time.split(":")[1]);

        return (h2*3600+m2*60-h1*3600-m1*60);
    }
}