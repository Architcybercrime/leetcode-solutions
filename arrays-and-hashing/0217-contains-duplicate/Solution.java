import java.util.*;

// LeetCode 217 - Contains Duplicate | Easy
// Brute force: O(n^2)  ->  Optimal: O(n) time, O(n) space (HashSet)
// Key idea: check "seen before?" BEFORE adding.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
