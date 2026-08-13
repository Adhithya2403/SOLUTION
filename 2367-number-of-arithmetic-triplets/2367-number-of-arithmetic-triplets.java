class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count=0;
        for(int n:nums){
            if(set.contains(n+diff) && set.contains(n+2 * diff))
            {
                count++;
            }
        }
        return count;
    }
}