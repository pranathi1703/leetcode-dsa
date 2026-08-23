class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int students = countStudent(nums, mid);

            if (students > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static int countStudent(int[] nums, int maxSum) {
        int students = 1;
        int pages = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pages + nums[i] <= maxSum) {
                pages += nums[i];
            } else {
                students++;
                pages = nums[i];
            }
        }

        return students;
    }
}