class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        long required = (long) m * k;

        if (required > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int bloom : bloomDay) {
            low = Math.min(low, bloom);
            high = Math.max(high, bloom);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                count++;

                if (count == k) {
                    bouquets++;
                    count = 0;

                    if (bouquets == m) {
                        return true;
                    }
                }

            } else {
                count = 0;
            }
        }

        return false;
    }
}