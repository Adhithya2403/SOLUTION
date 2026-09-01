class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }else{
                sbb.append(ch);
            }
        }
        sb.reverse();
        sbb.reverse();
        char res[] = s.toCharArray();
        int l=0;
        int m=0;
        for(int i=0;i<res.length;i++)
        {
            if(res[i]>='a' && res[i]<='z'){
                res[i]=sb.charAt(l++);
            }else{
                res[i]=sbb.charAt(m++);
            }
        }
        return new String(res);
    }
}