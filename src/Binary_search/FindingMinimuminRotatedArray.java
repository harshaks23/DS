package Binary_search;

public class FindingMinimuminRotatedArray {
    class Solution {
        public int findMin(int[] nums) {
            if (nums==null || nums.length==0)
            {
                return Integer.MIN_VALUE;
            }
            int left = 0, right = nums.length-1;
            while (left <= right) {
                int mid = left + (right-left)/2;


                if(left<mid &&nums[mid-1]>nums[mid])
                    return nums[mid];

                if(nums[mid]>nums[right])
                    left=mid+1;
                else
                    right=mid-1;

            }

            return nums[left];
        }
    }
}
