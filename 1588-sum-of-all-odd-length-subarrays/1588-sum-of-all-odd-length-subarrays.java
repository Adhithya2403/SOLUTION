class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int total = (i+1)*(n-i);
            int odd = (total+1)/2;
            ans += arr[i]*odd;
        }
        return ans;
    }
}