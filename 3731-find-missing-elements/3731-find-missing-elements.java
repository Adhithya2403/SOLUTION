class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int k=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            while(k<nums[i]){
                list.add(k);
                k++;
            }
            k++;
        }
        return list;
    }
}