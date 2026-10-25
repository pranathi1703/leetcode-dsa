
class Solution {
    public int superPow(int a, int[] b) {
        int mod = 1337;
        int ans = 1;

        a %= mod;

        for (int digit : b) {
            ans = (myPow(ans, 10, mod) *
                   myPow(a, digit, mod)) % mod;
        }

        return ans;
    }

    private int myPow(int a, int n, int mod) {
        int result = 1;
        a %= mod;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * a) % mod;
            }

            a = (a * a) % mod;
            n /= 2;
        }

        return result;
    }
}
