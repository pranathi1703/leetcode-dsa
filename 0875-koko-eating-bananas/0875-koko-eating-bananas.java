class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findmax(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long total = calculateHours(piles, mid);

            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static long calculateHours(int[] nums, int speed) {
        long total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += ((long) nums[i] + speed - 1) / speed;
        }

        return total;
    }

    public static int findmax(int[] piles) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        return max;
    }
}