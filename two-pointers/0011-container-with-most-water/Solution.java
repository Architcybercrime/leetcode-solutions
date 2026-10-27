// LeetCode 11 - Container With Most Water | Medium
// Brute force: every pair of lines -> O(n^2).  Optimal: O(n) time, O(1) space.
// Key idea: area = (r - l) * min(height[l], height[r]). Start with the widest pair and always
// move the SHORTER line inward: moving the taller one can only shrink the width without
// raising the height limit.
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(area, ans);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
