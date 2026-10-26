import java.util.*;

// LeetCode 242 - Valid Anagram | Easy
// Sort approach: O(n log n)  ->  Optimal: O(n) time, O(1) space (26-slot counter)
// Key idea: +1 for each char of s, -1 for each char of t; all counts must end at 0.
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }
}
