class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold) return -1;
        int low = 1;
        int high = findMax(nums);

        while(low<=high){
            int mid = low+(high-low)/2;
            if(sumOfDiv(nums,mid)<=threshold){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    public static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int n:nums){
            max = Math.max(n,max);
        }

        return max;
    }

    public static int sumOfDiv(int[] nums, int divisor){
        int sum = 0;
        for(int n:nums){
            sum += Math.ceil((double)n/divisor);
        }

        return sum;
    }
}