class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int rev = 0;
        while(num!=0){
            int digit = num%10;
            if(rev > (Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            rev = rev * 10 + digit;
            num/=10;
        }
        return (x>0) ? (rev):(-rev);
    }
}