package Stack_;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a circular array (the next element of the last element is the first element of the array), print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.
 * **/

public class nextElement2 {

   // smaller length code and explanation

    public int[] nextGreaterElements(int[] nums) {
        //just here same as previous problem solution but u iterate twice and then push to the stack only during the first iteration
        //veryeasy just have to keep in mind about when to push into stack
        int n = nums.length;
        int ret[] = new int[n];
        Arrays.fill(ret, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num)
                ret[stack.pop()] = num;
            if (i < n) stack.push(i);
        }
        return ret;

    }
}
