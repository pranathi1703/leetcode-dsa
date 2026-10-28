class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        if(x < 0) {
            return false;
        }
        while(x>0){
            int rem = x%10;
            rev = rem + rev*10;
            x = x/10;
        }
        
        return temp==rev;
    }
}