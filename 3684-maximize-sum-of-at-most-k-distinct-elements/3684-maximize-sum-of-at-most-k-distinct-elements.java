class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<>();
        
        for(int num:nums){
            set.add(num);
        }
        int arr[]=new int[set.size()];
        int m=0;
        for(int num:set){
            arr[m++]=num;
        }
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int l=0;
        for(int i=arr.length-1;i>=0 && l<k;i--){
            list.add(arr[i]);l++;
        }
        int ans[]=new int[list.size()];int z=0;
        for(int num:list){
            ans[z++]=num;
        }
        return ans;
    }
}