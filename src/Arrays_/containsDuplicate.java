package Arrays_;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set= new HashSet<Integer>();
            for(int n:nums)
            {
                if(set.contains(n)) return true;
                set.add(n);

            }
            return false;
        }
    }
    class Solution2 {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1])
                    return true;
            }
            return false;
        }
    }
}
