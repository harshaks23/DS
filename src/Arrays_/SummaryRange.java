package Arrays_;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> result = new ArrayList();
            if (nums == null || nums.length == 0) return result;

            int start = nums[0];
            int end = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - end == 1) {
                    end = nums[i];
                } else {
                    if (start == end) {
                        result.add(String.valueOf(start));
                    } else {
                        result.add(String.valueOf(start) + "->" + String.valueOf(end));
                    }
                    start = nums[i];
                    end = nums[i];
                }
            }

            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(String.valueOf(start) + "->" + String.valueOf(end));
            }

            return result;

        }
    }
}