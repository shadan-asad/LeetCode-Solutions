import java.util.ArrayDeque;

public class _901_OnlineStockSpan {
    class StockSpanner {

        class Pair {
            int num, c;
            Pair(int num, int c) {
                this.num = num;
                this.c = c;
            }
        }

        ArrayDeque<Pair> st;

        public StockSpanner() {
            st = new ArrayDeque<>();
        }

        public int next(int price) {
            st.push(new Pair(price, 1));
            if(price < st.peek().num) {
                return 1;
            }
            int cnt = 0;
            while(!st.isEmpty() && price >= st.peek().num) {
                cnt += st.peek().c;
                st.pop();
            }
            st.push(new Pair(price, cnt));

            return cnt;
        }
    }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}
