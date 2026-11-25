class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] dp1 = new int[n];
        Arrays.fill(dp1,-1);
        int case1 = maxAmount(n-2, 0, nums, dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2,-1);
        int case2 = maxAmount(n-1, 1, nums, dp2);

        return Math.max(case1, case2);
    }

    public int maxAmount(int end, int start, int[] nums, int[] dp){
        if(end < start)  return 0;
        if(end == start) return nums[end];
        if(dp[end] != -1) return dp[end];

        int pick = nums[end] + maxAmount(end-2,start,nums,dp);
        int notpick = 0 + maxAmount(end-1, start, nums,dp);

        return dp[end] = Math.max(pick,notpick);

    }
}