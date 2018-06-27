package TwoPointers;
//use pointers better than binary serach
public class twosumSoRTED {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int p1=0,p2=numbers.length-1;

            while(p1<p2)
            {
                int sum=numbers[p1] +numbers[p2];
                if(sum==target) return new int[]{p1+1,p2+1};
                if(sum<target) p1++;
                else
                    p2--;
            }
            return new int[]{-1,-1};

        }
    }
}
