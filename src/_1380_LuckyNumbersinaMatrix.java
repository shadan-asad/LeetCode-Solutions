import java.util.ArrayList;
import java.util.List;

public class _1380_LuckyNumbersinaMatrix {
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> list = new ArrayList<>();

            int i = 0, j = 0, k, num;

            while(i < matrix.length) {
                j = 0; k = 0; num = matrix[i][j];
                while(j < matrix[0].length) {
                    if(matrix[i][j] < num) {
                        num = matrix[i][j];
                        k = j;
                        System.out.println(num);
                    }
                    j++;
                }
                int l = 0;
                while(l < matrix.length) {
                    if(matrix[l][k] > num) {
                        break;
                    }
                    l++;
                }

                if(l == matrix.length)
                    list.add(num);

                i++;
            }

            return list;
        }
    }
}
