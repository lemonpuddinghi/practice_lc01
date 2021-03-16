class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return myPowHelper(x, N);
    }

    public double myPowHelper(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double temp = myPowHelper(x, n / 2);
        return n % 2 == 0?  temp * temp: temp * temp * x;
    }
}