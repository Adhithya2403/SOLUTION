class Solution {
    public boolean sumGame(String num) {
        int sum=0;
        int q=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?'){
                q++;
            }else{
                sum+=num.charAt(i)-'0';
            }
        }

        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?'){
                q--;
            }else{
                sum-=num.charAt(i)-'0';
            }
        }
        return q%2!=0||sum !=-q/2*9;
    }
}