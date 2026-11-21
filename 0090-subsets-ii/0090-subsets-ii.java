class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        int subset = 1<<n;

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int num = 0; num < subset;num++){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n;i++){
                if((num &(1<<i))!=0){
                    temp.add(nums[i]);
                }
            }
            result.add(temp);
        }
        return new ArrayList<>(result);

    }
}