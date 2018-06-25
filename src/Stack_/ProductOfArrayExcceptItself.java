package Stack_;

public class ProductOfArrayExcceptItself {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int prev=nums[0];
            //as we cant intiailaize first element in first pass we set it to 1

            int[] res= new int[nums.length];
            res[0]=1;
            for(int i=1;i<res.length;i++)
            {
                res[i]=res[i-1]*prev;
                prev=nums[i];
            }

            prev=nums[nums.length-1];
            for(int i=res.length-2;i>=0;i--)
            {
                res[i]=res[i]*prev;
                prev*=nums[i];
            }

            return res;
        }
    }
}
