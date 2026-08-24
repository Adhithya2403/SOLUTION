class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String b="";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.size();i++)
        {
            String ab =words.get(i);
            sb.append(ab.charAt(0));
        }
        return sb.toString().equals(s);
    }
}