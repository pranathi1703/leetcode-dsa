# JAVA SOLUTION - EASY APPROACH WITH EXPLANATION

# Explanation
1. Sort each row: Sort every row of the matrix in ascending order.

2. Find column maximum: Iterate through each column and find the maximum element among all rows.

3. Calculate score: Add the maximum element of each column to the total score.

4. Return the final score.

# Note: 
After sorting each row, the elements at the same column position are compared. The maximum among them contributes to the final score.

---
# Code
```java []
class Solution {
    public int matrixSum(int[][] nums) {
        for(int []row:nums)
        {
                Arrays.sort(row);
        } 
         int score = 0;
            for (int j = 0; j < nums[0].length; j++) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i][j]);
            }
            score += max;
        }
        return score;
    }
}
```

# Complexity Analysis

- Time Complexity: O(m × n log n) – Sorting all rows and traversing the matrix.
- Space Complexity: O(1) – No extra data structures are used (excluding sorting overhead).


Whenever a problem asks you to maximize a score after rearranging or comparing elements, check whether sorting can simplify the selection process.