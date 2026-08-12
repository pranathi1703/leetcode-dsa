// this solution is for another variety of this problem
// when pos != neg in the array
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i = 0;i < n;i++){
            if(nums[i] > 0){
                pos.add(nums[i]);
            } else{
                neg.add(nums[i]);
            }
        }

        if(pos.size() > neg.size()){
            for(int i = 0; i < neg.size(); i++){
                nums[i*2] = pos.get(i);
                nums[i*2+1] = neg.get(i);
            }
            int index = neg.size()*2;
            for(int i = neg.size(); i < pos.size();i++){
                nums[index] = pos.get(i);
                index++;
            }
        }
        else{
                for(int i = 0; i < pos.size(); i++){
                nums[i*2] = pos.get(i);
                nums[i*2+1] = neg.get(i);
            }
            int index = pos.size()*2;
            for(int i = pos.size(); i < neg.size();i++){
                nums[index] = neg.get(i);
                index++;
            }
        }
        return nums;
    }
}