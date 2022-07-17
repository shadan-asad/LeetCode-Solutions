import java.util.*;

public class _118_PascalsTriangle {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> a0 = new ArrayList<Integer>();
            a0.add(1);
            ans.add(a0);

            if(numRows == 1)
                return ans;

            List<Integer> a1 = new ArrayList<Integer>();
            a1.add(1); a1.add(1);
            ans.add(a1);

            if(numRows == 2)
                return ans;

            for(int i = 2; i < numRows; i++) {
                List<Integer> cur = new ArrayList<Integer>();
                cur.add(1);
                List<Integer> prev = ans.get(i-1);
                for(int j = 0; j < prev.size()-1; j++) {
                    cur.add(prev.get(j) + prev.get(j+1));
                }
                cur.add(1);
                ans.add(cur);
            }

            return ans;
        }
    }
}
