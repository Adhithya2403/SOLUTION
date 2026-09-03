class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        if(nums1[0]%2!=0){
            return true;
        }
        for(int num:nums1){
            if(num%2!=0){
                return false;
            }
        }
        return true;
    }
}