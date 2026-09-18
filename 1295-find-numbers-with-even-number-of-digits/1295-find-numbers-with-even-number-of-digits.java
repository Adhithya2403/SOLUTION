class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            String ab = String.valueOf(num);
            if(ab.length()%2==0) count++;
        }
        return count;

    }
}