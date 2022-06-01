import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1030_MatrixCellsinDistanceOrder {
    class Solution {
        public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

            HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    int dist = Math.abs(rCenter-i)+Math.abs(cCenter-j);

                    map.put(list, dist);
                }
            }

            int arr[] = new int[map.size()];
            int i = 0;
            for(Map.Entry<ArrayList<Integer>, Integer> set : map.entrySet()) {
                arr[i] = set.getValue();
                i++;
            }

            Arrays.sort(arr);
            int[][] ans = new int[arr.length][2];
            int a = 0;
            for(int element : arr) {

                for(Map.Entry<ArrayList<Integer>, Integer> set : map.entrySet()) {
                    if(set.getValue() == element) {
                        ans[a][0] = set.getKey().get(0);
                        ans[a][1] = set.getKey().get(1);
                        map.remove(set.getKey());
                        break;
                    }
                }
                a++;
            }
            return ans;
        }
    }
}
