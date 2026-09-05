class Solution {
    public int[] countOppositeParity(int[] nums) {
        int even=0; 
        int odd=0;
        int ans[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]%2==0){
                ans[i]=odd;
                even++;
            }else{
                ans[i]=even;
                odd++;
            }
        }
        return ans;
    }
}