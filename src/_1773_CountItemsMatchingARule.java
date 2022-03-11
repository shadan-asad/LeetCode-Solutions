import java.util.List;

public class _1773_CountItemsMatchingARule {
    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int x = 2, count = 0;
            if(ruleKey.equals("type"))
                x = 0;
            else if(ruleKey.equals("color"))
                x = 1;

            for(int i = 0; i < items.size(); i++) {
                if(ruleValue.equals(items.get(i).get(x)))
                    count++;
            }
            return count;
        }
    }
}
