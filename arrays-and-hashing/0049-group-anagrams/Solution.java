import java.util.*;

// LeetCode 49 - Group Anagrams | Medium
// Key idea: sorted letters of a word are identical for all its anagrams,
// so use the sorted string as a HashMap key. O(n * m log m) time, O(n * m) space.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
