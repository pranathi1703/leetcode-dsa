class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        boolean[] contains = new boolean[101];
        for(int i = 0; i < nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
            contains[nums[i]]=true;
        }
        for(int i = min; i <=max;i++){
            if(!contains[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}