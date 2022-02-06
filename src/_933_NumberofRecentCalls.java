import java.util.ArrayList;

public class _933_NumberofRecentCalls {
    class RecentCounter {
        ArrayList<Integer> request;
        int count;
        public RecentCounter() {
            this.request = new ArrayList<Integer>();
            this.count = 0;
        }

        public int ping(int t) {
            this.request.add(t);

            for(int i = this.request.size()-1; i >=0; i--) {
                int x = this.request.get(i);
                if(x >= t-3000 && x <= t)
                    count++;
                else
                    break;
            }
            return count;
        }
    }

/*
  Your RecentCounter object will be instantiated and called as such:
  RecentCounter obj = new RecentCounter();
  int param_1 = obj.ping(t);
*/
}
