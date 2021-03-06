package TwoPointers;

import java.util.Arrays;
/**Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

 Example:

 Given array nums = [-1, 2, 1, -4], and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

 **/
 public class ThreesumCloser {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            //just same but change is u dont try to skipand try all the possivliyy and just decrease right or increase left
            // and check whether the sum and target difference is lesser than exoected
            if(nums.length<4)
            {
                return nums[0]+nums[1]+nums[2];
            }
            Arrays.sort(nums);
            int result =nums[0] + nums[1] + nums[nums.length-1];

            for(int i = 0; i < nums.length - 2; i++)
            {

                int left = i + 1;
                int right = nums.length - 1;
                while(left < right)
                {
                    int sum=nums[i] + nums[left] + nums[right];
                    if(sum > target) right--;
                    else left++;

                    if(Math.abs(target-sum) <Math.abs(target-result))
                        result=sum;

                }
            }

            return result;


        }
    }
}
