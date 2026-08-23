class Solution {
    public int elevatorRequests(int n, int[] req) {
        int sum=0;
        int prev=0;
        for(int i=0;i<req.length;i++){
            sum+=Math.abs(prev-req[i]);
            prev=req[i];
        }
        return sum;
    }
}