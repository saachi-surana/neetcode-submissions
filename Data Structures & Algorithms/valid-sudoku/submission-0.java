class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r < board.length; r++) {
            Set<Character> row = new HashSet<>();
            for(int c = 0; c < board[0].length; c++) {
                if(board[r][c] == '.') continue;
                if(!row.add(board[r][c])) {
                    return false;
                }
            }
        }
        for(int c = 0; c < board[0].length; c++) {
            Set<Character> col = new HashSet<>();
            for(int r = 0; r < board.length; r++) {
                if(board[r][c] == '.') continue;
                if(!col.add(board[r][c])) {
                    return false;
                }
            }
        }
        for(int rStart = 0; rStart < 9; rStart = rStart + 3) {
            for(int cStart = 0; cStart < 9; cStart = cStart + 3) {
                Set<Character> box = new HashSet<>();
                for(int r = rStart; r < rStart + 3; r++) {
                    for(int c = cStart; c < cStart + 3; c++) {
                        if(board[r][c] == '.') continue;
                        if(!box.add(board[r][c])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
