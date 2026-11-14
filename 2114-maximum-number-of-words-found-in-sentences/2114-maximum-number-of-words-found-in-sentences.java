class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int j = 0; j < sentences.length; j++) {
            String s = sentences[j];
                int words = 1;
            for (int i = 0; i < s.length(); i++) {
            
                if (s.charAt(i) == ' ') {
                    words++;
                }
            }
            if (words > max) {
                    max = words;
                }
        }
        return max;
    }
}