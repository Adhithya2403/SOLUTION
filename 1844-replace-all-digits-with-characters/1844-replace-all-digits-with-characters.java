class Solution {
    public String replaceDigits(String s) {
        char arr[] = s.toCharArray();
        for(int i=1;i<s.length();i+=2)
        {
            int dig=arr[i]-'0';
            arr[i]=(char)(arr[i-1]+dig);
        }
        return new String(arr);
    }
}