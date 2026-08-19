class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            if (pile > high) {
                high = pile;
            }
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + (long) mid - 1) / mid;

                // No need to calculate further
                if (hours > h) {
                    break;
                }
            }

            if (hours <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}