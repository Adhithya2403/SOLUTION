class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String b="";
        for(int i=0;i<words.size();i++)
        {
            String ab =words.get(i);
            b+=ab.charAt(0);
        }
        return b.equals(s);
    }
}