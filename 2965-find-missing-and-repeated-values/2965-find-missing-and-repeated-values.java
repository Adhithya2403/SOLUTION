class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashSet<Integer> set = new HashSet<>();
        int repeated = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(!set.add(grid[i][j])) {
                    repeated = grid[i][j];
                }
            }
        }

        int total = grid.length * grid.length;
        int missing = 0;

        for(int i = 1; i <= total; i++) {
            if(!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}