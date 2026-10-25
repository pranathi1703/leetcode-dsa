
class Solution {
    public double myPow(double x, int n) {
        long pow = n;

        if (pow < 0) {
            pow = -pow;
        }

        double ans = power(x, pow);

        if (n < 0) {
            ans = 1.0 / ans;
        }

        return ans;
    }

    public double power(double x, long pow) {
        double ans = 1.0;

        while (pow > 0) {
            if (pow % 2 == 0) {
                x = x * x;
                pow = pow / 2;
            } else {
                ans = ans * x;
                pow = pow - 1;
            }
        }

        return ans;
    }
}
