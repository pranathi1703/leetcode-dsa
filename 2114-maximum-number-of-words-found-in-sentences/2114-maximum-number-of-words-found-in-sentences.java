class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
            int curr = countWords(s);
            if(curr > max){
                max = curr;
            }
        }
        return max;
    }

    public int countWords(String s){
        int cnt = 1;
        for(int i =0; i < s.length();i++){
            if(s.charAt(i)==' '){
                cnt++;
            }
        }
        return cnt;
    }
}