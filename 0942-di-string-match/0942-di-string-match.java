class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int low=0;
        int high=n;
        int prem[] = new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                prem[i]=low;
                low++;
            }else{
                prem[i]=high;
                high--;
            }
        }
        prem[n]=low;
        return prem;
    }
}