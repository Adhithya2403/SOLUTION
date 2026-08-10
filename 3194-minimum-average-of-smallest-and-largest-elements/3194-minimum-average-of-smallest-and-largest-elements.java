class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Double> list = new ArrayList<>();
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            double mm = (nums[left] + nums[right])/2.0;
            list.add(mm);
            left++;
            right--;
        }
        Collections.sort(list);
        return list.get(0);
    }
}