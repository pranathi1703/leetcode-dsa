class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        for (int[] current : intervals) {
            boolean merged = false;
            for (int i = 0; i < ans.size(); i++) {
                int[] last = ans.get(i);

                // Check overlap
                if (Math.max(current[0], last[0]) <=
                    Math.min(current[1], last[1])) {

                    // Merge
                    current = new int[]{
                        Math.min(current[0], last[0]),
                        Math.max(current[1], last[1])
                    };

                    ans.remove(i);
                    i--;

                    merged = true;
                }
            }

            ans.add(current);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}