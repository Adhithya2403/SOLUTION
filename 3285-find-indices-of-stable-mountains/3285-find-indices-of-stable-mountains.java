class Solution {
    public List<Integer> stableMountains(int[] height, int t) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>t){
                list.add(i);
            }
        }
        return list; 
    }
}