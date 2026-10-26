// LeetCode 26 - Remove Duplicates from Sorted Array | Easy
// Key idea: `i` marks the last unique value kept so far; `j` scans ahead.
// When nums[j] differs from nums[i], advance i and copy it there. O(n) time, O(1) space.
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
