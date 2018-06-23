package Arrays_;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    class Solution {
        public List<Integer> majorityElement(int[] nums) {

            List<Integer> list  = new ArrayList<>();

            if(nums==null || nums.length==0 )return list;
            int[] elem= new int[]{nums[0],nums[0]};
            int[] count=new int[]{0,0};



            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==elem[0])
                {count[0]++;

                }
                else

                if(nums[i]==elem[1])
                {count[1]++;

                }
                else
                if(count[0]==0)
                {
                    elem[0]=nums[i];
                    count[0]=1;
                }
                else
                if(count[1]==0)
                {
                    elem[1]=nums[i];
                    count[1]=1;
                }
                else
                {
                    count[0]--;
                    count[1]--;
                }


            }

            count[0]=0;count[1]=0;
            for(int i:nums)
            {
                if(i==elem[0])
                    count[0]++;
                else
                if(i==elem[1])
                    count[1]++;

            }

            if(count[0]>nums.length/3)
                list.add(elem[0]);

            if(count[1]>nums.length/3)
                list.add(elem[1]);

            return list;

        }
    }
}
