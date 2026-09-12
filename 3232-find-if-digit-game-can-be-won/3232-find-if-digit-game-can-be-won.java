class Solution {
    public boolean canAliceWin(int[] nums) {
        int dou=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sum+=nums[i];
            }else{
                dou+=nums[i];
            }
        }        
        return sum!=dou;
    }
}