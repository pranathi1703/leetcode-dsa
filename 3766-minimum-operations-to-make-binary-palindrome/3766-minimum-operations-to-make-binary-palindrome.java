class Solution {
    public int[] minOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int num = nums[i];
            int distance = 0;

            while (true) {

                if (num - distance >= 0 &&
                    isBinaryPalindrome(num - distance)) {

                    ans[i] = distance;
                    break;
                }
                if (isBinaryPalindrome(num + distance)) {

                    ans[i] = distance;
                    break;
                }

                distance++;
            }
        }

        return ans;
    }

    private boolean isBinaryPalindrome(int num) {

        String binary = Integer.toBinaryString(num);

        int left = 0;
        int right = binary.length() - 1;

        while (left < right) {

            if (binary.charAt(left) != binary.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}