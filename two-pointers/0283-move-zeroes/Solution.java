// LeetCode 283 - Move Zeroes | Easy
// Key idea: `left` marks the next spot for a non-zero value; `right` scans the array.
// Swap each non-zero forward to `left`. O(n) time, O(1) space, order of non-zeros preserved.
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
