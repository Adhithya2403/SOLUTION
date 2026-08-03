class Solution {
    public String stoneGameIII(int[] s) {
        int n=s.length;
        int [] arr= new int[n+1];
        for(int i=n-1;i>=0;i--){
            int sum=0;
            arr[i]=Integer.MIN_VALUE;
            for(int j=i;j<n&&j<i+3;j++){
                sum+=s[j];
                arr[i]=Math.max(arr[i],sum-arr[j+1]);
            }
        }
        if(arr[0]>0){
            return "Alice";
        }else if(arr[0]<0){
            return "Bob";
        }else{
            return "Tie";
        }
    }
}