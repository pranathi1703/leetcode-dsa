class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0; i < s.length();i++){
            for(int j = i; j < s.length();j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1 > longest.length()){
                        longest = s.substring(i,j+1);
                    }
                }
            }
        }
        return longest;
    }

    public static boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}