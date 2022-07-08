public class _50_Pow {
    class Solution {

        public double myPow(double x, int n) {
            double res;
            if(n < 0) {
                n = -n;
                if(n == Integer.MIN_VALUE) {
                    n--;
                    res = 1/(pow(x, n)*x);
                }else {
                    res = 1/pow(x,n);
                }
            }
            else
                res = pow(x, n);
            return res;
        }
        private double pow(double x, int n) {
            if(n == 0)
                return 1;
            if(n == 1)
                return x;

            double temp;
            if(n%2 == 0)
                temp = myPow(x*x, n/2);
            else
                temp = x*myPow(x, n-1);

            return temp;
        }
    }
}
