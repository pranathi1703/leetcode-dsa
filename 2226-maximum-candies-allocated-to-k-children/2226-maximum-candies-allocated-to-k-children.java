class Solution {
    public int maximumCandies(int[] candies, long k) {
        if(k==0) return 0;
        int low = 1, high = Integer.MIN_VALUE;
        for(int candy:candies){
            high = Math.max(candy,high);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            long count = 0;
            for(int candy:candies){
                count+=candy/mid;
            }
            if(count>=k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
}