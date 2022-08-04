import java.util.ArrayList;
import java.util.LinkedList;

public class _706_DesignHashMap {
    class MyHashMap {

        class Pair {
            int a, b;

            public Pair(int x, int y) {
                a = x;
                b = y;
            }
        }

        int size;
        ArrayList<LinkedList<Pair>> map;

        private int hash(int key) {
            return key%size;
        }

        public MyHashMap() {
            size = 1000;
            map = new ArrayList<>();
            for(int i = 0; i < size; i++)
                map.add(new LinkedList<Pair>());
        }

        public boolean contain(int key) {
            int i = hash(key);
            LinkedList<Pair> t = map.get(i);
            if(t.size() > 0) {
                int siz = t.size();
                for(int j = 0; j < siz; j++) {
                    if(t.get(j).a == key) {
                        return true;
                    }
                }
            }
            return false;
        }
        public void put(int key, int value) {
            if(!contain(key)) {
                Pair p = new Pair(key, value);
                int i = hash(key);
                map.get(i).add(p);
            }else {
                remove(key);
                Pair p = new Pair(key, value);
                int i = hash(key);
                map.get(i).add(p);
            }
        }

        public int get(int key) {
            if(contain(key)) {
                int i = hash(key);
                LinkedList<Pair> t = map.get(i);
                for(int j = 0; j < t.size(); j++) {
                    if(t.get(j).a == key) {
                        return t.get(j).b;
                    }
                }
            }
            return -1;
        }

        public Pair getPair(int key) {
            int i = hash(key);
            LinkedList<Pair> t = map.get(i);
            for(Pair p : t) {
                if(p.a == key) {
                    return p;
                }
            }
            return new Pair(0, 0);
        }

        public void remove(int key) {
            if(!contain(key)) return;

            int i = hash(key);
            Pair p = (getPair(key));
            map.get(i).remove(p);
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}
