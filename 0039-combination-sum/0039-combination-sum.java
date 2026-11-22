class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(0,candidates,target,result, new ArrayList<>());
        return result;
    }
    public void findCombination(int i, int[] arr, int target, List<List<Integer>> result, List<Integer> temp){
        if(i == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        if(arr[i]<=target){
            temp.add(arr[i]);
            findCombination(i,arr,target- arr[i],result,temp);
            temp.remove(temp.size()-1);
        }
        findCombination(i+1,arr,target,result,temp);
    }
}