class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 1;i <=numRows;i++){
            triangle.add(pascal(i));
        }

        return triangle;
    }

    public List<Integer> pascal(int n){
        int ans = 1;
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int col = 1;col < n;col++){
            ans = ans*(n-col);
            ans/=col;
            row.add(ans);

        }
        return row;

    }
}