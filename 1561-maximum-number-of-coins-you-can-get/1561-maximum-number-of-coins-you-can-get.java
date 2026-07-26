class Solution {
    public int maxCoins(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int t=n/3;
        int sum=0;
        int left=0;
        int right=n-2;
        while(t>0)
        {
            sum+=nums[right];
            right-=2;
            left++;
            t--;
        }
        return sum;
    }
}