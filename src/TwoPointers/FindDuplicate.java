package TwoPointers;
//use tortize and haze as in linked list and also
public class FindDuplicate {
    class Solution {
        public int findDuplicate(int[] nums) {
            // Find the intersection point of the two runners.
            int tortoise = nums[0];
            int hare = nums[0];
            do {
                tortoise = nums[tortoise];
                hare = nums[nums[hare]];
            } while (tortoise != hare);

            // Find the "entrance" to the cycle.
            int ptr1 = nums[0];
            int ptr2 = tortoise;
            while (ptr1 != ptr2) {
                ptr1 = nums[ptr1];
                ptr2 = nums[ptr2];
            }

            return ptr1;
        }
    }

    class Solution2 {
        public int findDuplicate(int[] nums) {

            for(int i=0;i<nums.length;i++)
            {
                if(nums[Math.abs(nums[i])] >0)
                {
                    nums[Math.abs(nums[i])]=-nums[Math.abs(nums[i])];
                }
                else
                {
                    return Math.abs(nums[i]);
                }

            }
            return -1;
        }
    }
}
