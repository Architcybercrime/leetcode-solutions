// LeetCode 167 - Two Sum II (Input Array Is Sorted) | Medium
// Brute force: O(n^2)  ->  Optimal: O(n) time, O(1) space (two pointers from both ends).
// Key idea: sum too big -> move the right pointer left; too small -> move the left pointer right.
// Indices are 1-based, so return l + 1 and r + 1.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[2];
    }
}
