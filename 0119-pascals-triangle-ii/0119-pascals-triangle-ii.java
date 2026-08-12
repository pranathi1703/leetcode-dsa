class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long ans = 1;
        row.add(1);
        for(int i = 1;i<=rowIndex;i++){
            ans = ans *(rowIndex-i+1);
            ans/=i;

            row.add((int)ans);
        }

        return row;
    }
}