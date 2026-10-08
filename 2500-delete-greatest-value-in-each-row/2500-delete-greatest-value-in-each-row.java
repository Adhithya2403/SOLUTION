class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;

        for (int[] row : grid) {
            Arrays.sort(row);
        }

        for (int j = grid[0].length - 1; j >= 0; j--) {
            int max = 0;

            for (int i = 0; i < grid.length; i++) {
                max = Math.max(max, grid[i][j]);
            }

            ans += max;
        }

        return ans;
    }
}