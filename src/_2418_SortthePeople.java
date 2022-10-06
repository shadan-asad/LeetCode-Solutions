public class _2418_SortthePeople {
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {

            for(int i = 0; i < heights.length; i++) {
                int key = i;
                for(int j = i+1; j < heights.length; j++) {
                    if(heights[j] > heights[key]) {
                        key = j;
                    }
                }
                int temp = heights[i];
                heights[i] = heights[key];
                heights[key] = temp;
                String t = names[i];
                names[i] = names[key];
                names[key] = t;
            }
            return names;
        }
    }
}
