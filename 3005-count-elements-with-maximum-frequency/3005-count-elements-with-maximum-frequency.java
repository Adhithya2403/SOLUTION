class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>max){
                max=map.get(nums[i]);
            }
        }
        int sum=0;
        for(int num:map.values()){
            if(num==max){
                sum+=max;
            }
        }
        return sum;
    }
}