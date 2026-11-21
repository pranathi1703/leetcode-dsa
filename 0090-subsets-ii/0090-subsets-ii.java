class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, temp, result);
        return result;
    }
    public void backtrack(int[] nums, int index,
                          List<Integer> temp,
                          List<List<Integer>> result) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        backtrack(nums, index + 1, temp, result);

        temp.remove(temp.size() - 1);

        while (index + 1 < nums.length &&
               nums[index] == nums[index + 1]) {
            index++;
        }
        backtrack(nums, index + 1, temp, result);
    }
}
