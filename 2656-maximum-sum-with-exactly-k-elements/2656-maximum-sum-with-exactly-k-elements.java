class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);int sum = 0;int a=nums[nums.length-1];
        for(int i=a;i<nums[nums.length-1]+k;i++){
            sum=sum+i;
        }
        return sum;
    }
}