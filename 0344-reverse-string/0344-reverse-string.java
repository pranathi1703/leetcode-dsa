class Solution {
    public void reverseString(char[] s) {
        swap(0,s.length,s);
    }
    public void swap(int i, int n, char[] s){
        if( i >= n/2) return;
        char temp = s[i];
        s[i] = s[n-i-1];
        s[n-i-1] = temp;
        swap(i+1,n,s);
    }
}