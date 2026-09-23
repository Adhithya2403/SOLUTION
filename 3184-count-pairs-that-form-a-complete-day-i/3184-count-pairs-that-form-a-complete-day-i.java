class Solution {
    public int countCompleteDayPairs(int[] hours) {
        HashMap<Integer,Integer> map = new HashMap<>();int count=0;
        for(int hour:hours){
            int rem=hour%24;
            int need=(24-rem)%24;
            count+=map.getOrDefault(need,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}