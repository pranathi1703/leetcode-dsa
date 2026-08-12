class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {

        int n = tasks.length;
        int m = shifts.length;

        long[] prefix = new long[n];
        prefix[0] = tasks[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + tasks[i];
        }

        long total = prefix[n - 1];
        long progress = 0;

        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            progress += shifts[i];

            if (progress >= total) {
                ans[i] = 0;
                progress = 0;
            } else {
                int idx = upperBound(prefix, progress);
                ans[i] = n - idx;
            }
        }

        return ans;
    }

    private int upperBound(long[] arr, long target) {
        int left = 0, right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}