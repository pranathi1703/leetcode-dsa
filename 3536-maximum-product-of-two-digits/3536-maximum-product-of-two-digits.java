class Solution {
    public int maxProduct(int n) {
        int max = -1, max1 = -1;
        while(n!=0){
            int rem = n %10;
            if(max<=rem){
                max1 = max;
                max = rem;
            }
            else if(max1<rem){
                max1 = rem;
            }
            n/=10;

        }
        return max1*max;
    }
}