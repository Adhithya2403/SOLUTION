class Solution {
    public String restoreString(String s, int[] index) {
        char ans[] = new char[s.length()];
        for(int i=0;i<s.length();i++){
            ans[index[i]]=s.charAt(i);
        }
        return new String(ans);
    }
}