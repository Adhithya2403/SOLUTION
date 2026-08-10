class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int sum=0;
            for(int j=0;j<tasks[0].length;j++){
                sum+=tasks[i][j];
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}