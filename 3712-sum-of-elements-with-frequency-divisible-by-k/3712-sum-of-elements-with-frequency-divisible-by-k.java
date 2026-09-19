class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> ent : map.entrySet())
        {
            int key=ent.getKey();
            int val=ent.getValue();
            if(val%k==0){
                sum+=key*val;
            }
        }
        return sum;
    }
}