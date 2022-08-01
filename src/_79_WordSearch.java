public class _79_WordSearch {
    class Solution {
        public boolean exist(char[][] board, String word) {
            for(int x = 0; x < board.length; x++) {
                for(int y = 0; y < board[0].length; y++) {
                    if(help(board, word, x, y, 0)) return true;
                }
            }
            return false;
        }
        private boolean help(char[][] board, String word, int a, int b, int i) {
            if(i == word.length()) {
                return true;
            }
            if(a < 0 || b < 0 || a >= board.length || b >= board[0].length || board[a][b] != word.charAt(i)){
                return false;
            }

            board[a][b] = '1';

            boolean one = false, two = false, three = false, four = false;
            one = help(board, word, a, b-1, i+1);
            two = help(board, word, a, b+1, i+1);
            three = help(board, word, a-1, b, i+1);
            four = help(board, word, a+1, b, i+1);

            board[a][b] = word.charAt(i);

            return (one | two | three | four);
        }
    }
}
