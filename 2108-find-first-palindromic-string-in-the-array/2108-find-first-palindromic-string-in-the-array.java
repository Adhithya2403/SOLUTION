class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String abc = words[i];
            String bc=new StringBuilder(abc).reverse().toString();
            if(abc.equals(bc)){
                return abc;
            }
        }
        return "";
    }
}