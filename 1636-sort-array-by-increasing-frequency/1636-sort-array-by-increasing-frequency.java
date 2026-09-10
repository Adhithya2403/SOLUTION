class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Integer arr[] = new Integer[nums.length];

        for(int i = 0 ;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            if(map.get(a).equals(map.get(b)))
            {
                return b-a;
            }
            return map.get(a)-map.get(b);
        });

        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}