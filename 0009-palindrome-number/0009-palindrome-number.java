class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while(x>0){
            int rem = x%10;
            rev = rem + rev*10;
            x = x/10;
        }
        if(temp == rev) return true;
        return false;
    }
}