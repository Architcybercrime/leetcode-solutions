// LeetCode 125 - Valid Palindrome | Easy
// Approach: strip everything that is not a letter/digit, lowercase, then compare from both ends.
// O(n) time, O(n) space. TODO: O(1) space version with two pointers on the original string.
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int l = s.length() - 1;

        while (start < l) {
            if (s.charAt(start) != s.charAt(l)) {
                return false;
            }
            start++;
            l--;
        }
        return true;
    }
}
