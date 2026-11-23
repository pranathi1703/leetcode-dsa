class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, result, new ArrayList<>());
        return result;
    }

    public void findCombinations(int i, int[] arr, int target, List<List<Integer>> result, List<Integer> temp){
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (i == arr.length) {
            return;
        }

        if(arr[i] <= target){
            temp.add(arr[i]);
            findCombinations(i+1,arr,target-arr[i],result,temp);
            temp.remove(temp.size()-1);
        }
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }
        findCombinations(i+1,arr,target,result,temp);
    }
}