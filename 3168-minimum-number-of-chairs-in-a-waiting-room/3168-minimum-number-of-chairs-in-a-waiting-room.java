class Solution {
    public int minimumChairs(String s) {
        int curr=0;
        int max=0;
        for(char a : s.toCharArray()){
            if(a=='E'){
                curr++;
                max=Math.max(curr,max);
            }
            else{
                curr--;
            }
        }
        return max;
    }
}