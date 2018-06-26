package TwoPointers;

public class RemoveDuplicatesFRomSortedArray2 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int j=1;
            if(nums.length<=1) return nums.length;
            int i=0;
            int count=1;
            while(j<nums.length)
            {

                if( nums[j]!=nums[i] )
                {
                    i++;
                    count=1;
                    nums[i]=nums[j];
                    j++;
                }
                else if  (nums[j]==nums[i] && count<2)
                {
                    count++;
                    i++;
                    nums[i]=nums[j];
                    j++;
                }
                else
                {
                    j++;

                }
            }

            return i+1;
        }
    }

}
