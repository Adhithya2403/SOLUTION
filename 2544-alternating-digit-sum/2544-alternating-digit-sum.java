class Solution {
    public int alternateDigitSum(int n) {
        String str = String.valueOf(n);
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int num=ch-'0';
            if(i%2==0){
                sum+=num;
            }
            else{
                sum-=num;
            }
        }
        return sum;
    }
}