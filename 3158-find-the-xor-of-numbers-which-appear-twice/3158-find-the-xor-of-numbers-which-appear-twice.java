class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(int num:nums){
            if(map.get(num)==2){
                sum^=num;
                map.put(num,0);
            }
        }
        return sum;
    }
}