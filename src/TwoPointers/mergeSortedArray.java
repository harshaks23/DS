package TwoPointers;

public class mergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int mPtr = m - 1;
            int nPtr = n - 1;
            int index = nums1.length - 1;
            while (nPtr >= 0) {
                if (mPtr >= 0 && nums1[mPtr] >= nums2[nPtr]) {
                    nums1[index--] = nums1[mPtr--];
                } else {
                    nums1[index--] = nums2[nPtr--];
                }
            }
        }
    }
}
