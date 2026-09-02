class Solution {
    public int minOperations(int[] nums) 
    {
        int op=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                int need =nums[i-1]+1-nums[i];
                op+=need;
                nums[i]=nums[i-1]+1;
            }
        }
        return op;
    }
}