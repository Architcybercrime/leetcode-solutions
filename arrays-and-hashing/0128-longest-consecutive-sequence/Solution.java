import java.util.*;

// LeetCode 128 - Longest Consecutive Sequence | Medium
// Sort approach: O(n log n)  ->  Optimal: O(n) time, O(n) space (HashSet).
// Key idea: only start counting at the first number of a run (x - 1 is NOT in the set),
// then walk upward while x + length is in the set. Each number is visited by one run only.
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int ans = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int l = 1;
                while (set.contains(x + l)) {
                    l++;
                }
                ans = Math.max(ans, l);
            }
        }
        return ans;
    }
}
