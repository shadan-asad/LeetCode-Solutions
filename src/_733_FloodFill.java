import java.util.ArrayDeque;

public class _733_FloodFill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            ArrayDeque<Integer[]> st = new ArrayDeque<>();
            int i,j;
            st.push(new Integer[]{sr,sc});

            while(!st.isEmpty()) {
                i = st.peek()[0];
                j = st.peek()[1];
                st.pop();

                ifConnected(image, i-1,j, sr, sc, newColor, st);
                ifConnected(image, i+1,j, sr, sc, newColor, st);
                ifConnected(image, i,j-1, sr, sc, newColor, st);
                ifConnected(image, i,j+1, sr, sc, newColor, st);
            }
            for(int a=0; a < image.length; a++)
                for(int b=0; b < image[0].length; b++)
                    if(image[a][b] == -1)
                        image[a][b] = newColor;

            image[sr][sc] = newColor;
            return image;
        }
        public void ifConnected(int[][] image, int i, int j, int sr, int sc, int newColor, ArrayDeque<Integer[]> st) {
            if(i >= 0 && i < image.length && j >= 0 && j < image[0].length && !(i==sr & j==sc)) {

                if(image[i][j] == image[sr][sc]) {
                    st.push(new Integer[]{i,j});
                    image[i][j] = -1;
                }
            }
        }
    }
}
