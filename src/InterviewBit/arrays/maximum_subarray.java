package InterviewBit.arrays;

public class maximum_subarray {
    public class Solution {
          public int maxSubArray(final int[] A) {
            int max_final=Integer.MIN_VALUE;
            int max_now=0;

            for(int i=0;i<A.length;i++)
            {
                max_now+=A[i];
                if(max_final<max_now)
                {
                    max_final=max_now;
                }
                if(max_now<0)
                {
                    max_now=0;
                }


            }
            return max_final;
        }
    }

}
