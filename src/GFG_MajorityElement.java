import java.util.HashMap;

public class GFG_MajorityElement {
    class Solution
    {
        static int majorityElement(int a[], int size)
        {
            // your code here
            int max = 0, element = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < size; i++) {
                if(map.containsKey(a[i])) {
                    map.put(a[i], map.get(a[i])+1);
                }else {
                    map.put(a[i], 1);
                }
            }
            for(Integer i : map.keySet()) {
                if(map.get(i) > max) {
                    max = map.get(i);
                    element = i;
                }
            }
            if(max > size/2) {
                return element;
            }
            return -1;
        }
    }
}
