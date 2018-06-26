package TwoPointers;

public class RemoveDuplicatesfromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int j=1;
            if(nums.length<=1) return nums.length;
            int i=0;
            while(j<nums.length)
            {

                if(nums[j]==nums[i])
                {
                    j++;
                }
                else
                {
                    i++;
                    nums[i]=nums[j];
                    j++;
                }
            }

            return i+1;
        }
    }
}
