class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length-1;
        return (nums[len]*nums[len-1])-(nums[0]*nums[1]);
    }
}