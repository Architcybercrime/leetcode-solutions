import java.util.*;

// LeetCode 36 - Valid Sudoku | Medium
// Key idea: one HashSet per row, column and 3x3 box; check "seen?" BEFORE adding.
// Box index for cell (r, c) = (r / 3) * 3 + (c / 3). O(81) time, O(1) space (fixed 9x9 board).
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') {
                    continue;
                }
                int boxIndex = (r / 3) * 3 + (c / 3);

                if (rows[r].contains(val) || columns[c].contains(val) || boxes[boxIndex].contains(val)) {
                    return false;
                }
                rows[r].add(val);
                columns[c].add(val);
                boxes[boxIndex].add(val);
            }
        }
        return true;
    }
}
