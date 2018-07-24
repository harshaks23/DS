package InterviewBit.arrays;
//You are given a read only array of n integers from 1 to n.
//
//Each integer appears exactly once except A which appears twice and B which is missing.
//
//Return A and B.
//
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//Note that in your output A should precede B.
//
//Example:
//
//Input:[3 1 2 5 3]
//
//Output:[3, 4]
//
//A = 3, B = 4
public class RepeatandMissingNumber {
    public class Solution {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int[] repeatedNumber(final int[] A) {

            int [] ret= new int[2];
            for(int i=0;i<A.length;i++)
            {
                if(A[Math.abs(A[i])-1]<0)
                {
                    ret[0]=Math.abs(A[i]);
                }
                else
                {
                    A[Math.abs(A[i])-1]=-A[Math.abs(A[i])-1];
                }
            }

            for(int i=0;i<A.length;i++)
            {
                if(A[i]>0)
                {
                    ret[1]=i+1;
                    break;
                }
            }

            return ret;
        }
    }

}
