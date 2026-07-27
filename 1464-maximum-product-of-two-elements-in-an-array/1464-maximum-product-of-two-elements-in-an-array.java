class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int ab = nums[nums.length-1]-1;
        int cd = nums[nums.length-2]-1;

        return ab*cd;
        
    }
}