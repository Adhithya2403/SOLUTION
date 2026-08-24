class Solution {
    public int countAsterisks(String s) 
    {
        int count=0; int cc=0;
        for(int i=0;i<s.length();i++)
        {
            char ab = s.charAt(i);

            if(ab=='|'){
                cc++;
            }
            
            if(ab =='*' && cc%2==0)
            {
                count++;
            }
            
        }
        return count;
    }
}