package TwoPointers;

//removing element when more are there and if just 1 elements are there.
public class removeelement {

    class Solution2 {
        public int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
    return n;
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int begin=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {

                nums[begin++]=nums[i];
            }
        }

        return begin;
    }
}
}