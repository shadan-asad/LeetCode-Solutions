import java.util.ArrayDeque;

public class _733_FloodFill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            if(image[sr][sc] == color) {
                return image;
            }
            int cur = image[sr][sc];
            image[sr][sc] = color;
            if((sr >= 0 && sr < image.length) && (sc-1 >= 0 && sc-1 < image[0].length) &&
                    image[sr][sc-1] == cur) {
                floodFill(image, sr, sc-1, color);
            }
            if((sr >= 0 && sr < image.length) && (sc+1 >= 0 && sc+1 < image[0].length) &&
                    image[sr][sc+1] == cur) {
                floodFill(image, sr, sc+1, color);
            }
            if((sr-1 >= 0 && sr-1 < image.length) && (sc >= 0 && sc < image[0].length) &&
                    image[sr-1][sc] == cur) {
                floodFill(image, sr-1, sc, color);
            }
            if((sr+1 >= 0 && sr+1 < image.length) && (sc >= 0 && sc < image[0].length) &&
                    image[sr+1][sc] == cur) {
                floodFill(image, sr+1, sc, color);
            }
            return image;
        }
    }
}
