import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _341_FlattenNestedListIterator {
    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     * **/
     public interface NestedInteger {

          // @return true if this NestedInteger holds a single integer, rather than a nested list.
          public boolean isInteger();

          // @return the single integer that this NestedInteger holds, if it holds a single integer
          // Return null if this NestedInteger holds a nested list
          public Integer getInteger();

          // @return the nested list that this NestedInteger holds, if it holds a nested list
          // Return empty list if this NestedInteger holds a single integer
          public List<NestedInteger> getList();
      }

    public class NestedIterator implements Iterator<Integer> {

        List<Integer> ans;
        int i = 0;
        public NestedIterator(List<NestedInteger> nestedList) {
            ans = new ArrayList<Integer>();
            fun(nestedList);
        }

        public void fun(List<NestedInteger> list) {

            for(NestedInteger x : list) {
                if(x.isInteger()) {
                    ans.add(x.getInteger());
                }else {
                    fun(x.getList());
                }
            }
        }

        @Override
        public Integer next() {
            if(hasNext())
                return ans.get(i++);
            return null;
        }

        @Override
        public boolean hasNext() {

            return !(i == ans.size());
        }
    }

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
