import java.util.ArrayList;
import java.util.LinkedList;

public class _705_DesignHashSet {
    class MyHashSet {

        ArrayList<LinkedList<Integer>> hs;
        int size;
        public MyHashSet() {
            size = 1000;
            hs = new ArrayList<LinkedList<Integer>>(size);
            for(int i = 0; i < size; i++)
                hs.add(new LinkedList<Integer>());
        }

        private int hash(int key) {
            return key%size;
        }

        public void add(int key) {
            if(!contains(key)) {
                int i = hash(key);
                hs.get(i).add(key);
            }
        }

        public void remove(int key) {
            if(!contains(key)) return;

            int i = hash(key);
            hs.get(i).remove(Integer.valueOf(key));
        }

        public boolean contains(int key) {
            int i = hash(key);

            LinkedList<Integer> list = hs.get(i);
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j) == key) {
                    return true;
                }
            }
            return false;
        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
