class Solution {
    public int maxDepth(String s) {
        int dep=0;
        int max=0;
        for(char a:s.toCharArray()){
            if(a=='('){
                dep++;
                max=Math.max(max,dep);
            }else if(a==')'){
                dep--;
            }
        }
        return max;
    }
}