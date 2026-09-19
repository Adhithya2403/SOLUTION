class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ar:arr){
            map.put(ar,map.getOrDefault(ar,0)+1);
        }
        int max=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
           int val= map.get(arr[i]);
           if(val==arr[i])
           {
            list.add(val);
           }
        }
        if(list.size()==0)return -1;
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}