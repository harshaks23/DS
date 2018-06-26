package TwoPointers;
//easy just store the value after zero and before zero ie when u find the next zero u knonw from what iis the no of  1s before

//Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.
//
//Example 1:
//Input: [1,0,1,1,0]
//Output: 4
//Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
//    After flipping, the maximum number of consecutive 1s is 4.
//Note:
//
//The input array will only contain 0 and 1.
//The length of input array is a positive integer and will not exceed 10,000
//Follow up:
//What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?
public class MaxConsecctuivezeros2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0, zeroLeft = 0, zeroRight = 0;
        for (int i=0;i<nums.length;i++) {
            zeroRight++;
            if (nums[i] == 0) {
                zeroLeft = zeroRight;
                zeroRight = 0;
            }
            maxConsecutive = Math.max(maxConsecutive, zeroLeft+zeroRight);
        }
        return maxConsecutive;
    }
}
