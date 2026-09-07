class Solution {
    public int distinctSubseqII(String s) {
        final int MOD = 1_000_000_007;

        long dp = 0;
        long[] last = new long[26];

        for (char c : s.toCharArray()) {
            int index = c - 'a';

            long newDp = (2 * dp + 1 - last[index]) % MOD;

            if (newDp < 0) {
                newDp += MOD;
            }

            last[index] = (dp + 1) % MOD;
            dp = newDp;
        }

        return (int) dp;
    }
}