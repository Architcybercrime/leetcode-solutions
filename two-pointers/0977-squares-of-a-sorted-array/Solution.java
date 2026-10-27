// LeetCode 977 - Squares of a Sorted Array | Easy
// Brute force: square everything, then sort -> O(n log n).
// Optimal: O(n) time. After squaring, the largest value is always at one of the two ends
// of the original array, so fill the answer from the back, moving the pointer that held it.
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int p = n - 1;
        int[] ans = new int[n];
        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                ans[p] = nums[l] * nums[l];
                l++;
            } else {
                ans[p] = nums[r] * nums[r];
                r--;
            }
            p--;
        }
        return ans;
    }
}
