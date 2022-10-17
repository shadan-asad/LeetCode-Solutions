import java.util.HashMap;

public class _1941_CheckifAllCharactersHaveEqualNumberofOccurrences {
    class Solution {
        public boolean areOccurrencesEqual(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < s.length(); i++) {
                if(!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                }else {
                    map.replace(s.charAt(i), map.get(s.charAt(i))+1);
                }
            }
            int count = map.get(s.charAt(0));
            for(Character c : map.keySet()) {
                if(map.get(c) != count) {
                    return false;
                }
            }
            return true;
        }
    }
}
