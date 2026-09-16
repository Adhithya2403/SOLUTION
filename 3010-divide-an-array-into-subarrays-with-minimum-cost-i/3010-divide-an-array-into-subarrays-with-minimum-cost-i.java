class Solution {
    public int minimumCost(int[] nums) {
        int nn=nums[0];
        Arrays.sort(nums,1,nums.length);
        return nums[0]+nums[1]+nums[2];
    }
}