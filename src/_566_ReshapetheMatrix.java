public class _566_ReshapetheMatrix {
    class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int m = mat.length, n = mat[0].length, a = 0, b = 0;
            if(m*n != r*c || (m == r && n == c))
                return mat;

            int[][] arr = new int[r][c];

            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    arr[i][j] = mat[a][b];
                    b++;
                    if(b == n) {
                        b = 0;
                        a++;
                    }
                }
            }

            return arr;
        }
    }
}
