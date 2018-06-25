package Stack_;

public class MajorityElement {

    class Solution {
        public int majorityElement(int[] nums)
        {

            int count=0;
            int element=nums[0];
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=element)
                {
                    count--;
                    if(count==0)
                    {
                        element=nums[i];
                        count=1;
                    }


                }
                else
                {
                    count++;
                }


            }


            return element;


        }
    }
}
