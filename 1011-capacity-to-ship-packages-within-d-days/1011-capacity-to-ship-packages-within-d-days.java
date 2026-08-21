class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low < high) {
            int capacity = low + (high - low) / 2;

            if (canShip(weights, days, capacity)) {
                high = capacity;       
            } else {
                low = capacity + 1;    
            }
        }

        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                daysNeeded++;
                currentLoad = weight;

                if (daysNeeded > days) {
                    return false;
                }
            } else {
                currentLoad += weight;
            }
        }

        return true;
    }
}