class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        int n = s.length();
        char[] result = new char[n];
        int index = 0;
        int len = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < n; j += len) {
                // Append the main vertical column element
                result[index++] = s.charAt(j);

                // Append the diagonal element (if not top or bottom row)
                int diagIndex = j + len - 2 * row;
                if (row != 0 && row != numRows - 1 && diagIndex < n) {
                    result[index++] = s.charAt(diagIndex);
                }
            }
        }

        return new String(result);
    }
}