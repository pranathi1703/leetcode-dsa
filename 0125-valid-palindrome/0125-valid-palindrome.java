class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char l = s.charAt(left);
            
            if (!((l >= 'a' && l <= 'z') || (l >= 'A' && l <= 'Z') || (l >= '0' && l <= '9'))) {
                left++;
                continue;
            }
            
            char r = s.charAt(right);
            
            if (!((r >= 'a' && r <= 'z') || (r >= 'A' && r <= 'Z') || (r >= '0' && r <= '9'))) {
                right--;
                continue;
            }
            
            if (l >= 'A' && l <= 'Z') l = (char) (l + 32);
            if (r >= 'A' && r <= 'Z') r = (char) (r + 32);
            
            if (l != r) {
                return false;
            }
            
            left++;
            right--;
        }
        return true;
    }
}