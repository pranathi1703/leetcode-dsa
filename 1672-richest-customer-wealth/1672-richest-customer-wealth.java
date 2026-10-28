class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // Wealth cannot be negative per problem constraints
        
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int bank : customer) {
                currentWealth += bank;
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        
        return maxWealth;
    }
}