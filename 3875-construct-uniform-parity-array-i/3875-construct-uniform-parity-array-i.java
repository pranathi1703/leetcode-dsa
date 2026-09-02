class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;
        boolean canMakeEven = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                continue;
            }
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int value = nums[i] - nums[j];

                    if (value % 2 == 0) {
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                canMakeEven = false;
                break;
            }
        }

        if (canMakeEven) {
            return true;
        }

        boolean canMakeOdd = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                continue;
            }
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int value = nums[i] - nums[j];

                    if (value % 2 != 0) {
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                canMakeOdd = false;
                break;
            }
        }

        return canMakeOdd;
    }
}