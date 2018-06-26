package TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class HashMap2Sum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> temp = new HashMap<>();

            for(int i=0;i<nums.length;i++)
            {
                if(temp.containsKey(nums[i]))
                {
                    return new int[]{temp.get(nums[i]),i};
                }
                else
                {
                    temp.put(target-nums[i],i);
                }

            }
            return new int[]{-1,-1};
        }
    }
}
