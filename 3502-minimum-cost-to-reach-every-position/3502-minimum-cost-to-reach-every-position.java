class Solution {
    public int[] minCosts(int[] cost) {
        int cheap=cost[0];
        for(int i=1;i<cost.length;i++){
            cheap=Math.min(cheap,cost[i]);
            cost[i]=cheap;
        }
        return cost;
    }
}