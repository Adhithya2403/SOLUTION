class Solution {
    public int reverseDegree(String s) {
        int ch=0;int k=1;int sum=0;
        for(int i=0;i<s.length();i++){
            ch='z'-s.charAt(i)+1;
            sum+=(ch*k++);
        }
        return sum;
    }
}