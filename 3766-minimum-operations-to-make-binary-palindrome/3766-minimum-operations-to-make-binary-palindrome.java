class Solution {

    public int[] minOperations(int[] nums) {

        int[] ans = new int[nums.length];

        // Store all binary palindromes from 1 to 5000
        boolean[] palindrome = new boolean[5001];

        for (int i = 1; i <= 5000; i++) {
            palindrome[i] = isBinaryPalindrome(i);
        }

        // Find minimum distance for every number
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            int distance = 0;

            while (true) {

                // Check smaller number
                if (num - distance >= 1 &&
                    palindrome[num - distance]) {

                    ans[i] = distance;
                    break;
                }

                // Check larger number
                if (num + distance <= 5000 &&
                    palindrome[num + distance]) {

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