package Stack_;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextElement {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            Stack<Integer> stack= new Stack<>();
            Map<Integer,Integer> map= new HashMap<Integer,Integer>();
            for(int i=0;i<nums2.length;i++)
            {
                while(!stack.isEmpty() && stack.peek() < nums2[i])
                {
                    map.put(stack.pop(),nums2[i]);
                }
                stack.push(nums2[i]);
            }
            for(int i=0;i<nums1.length;i++)
            {
                nums1[i]=map.getOrDefault(nums1[i],-1);
            }

            return nums1;
        }
    }
}
