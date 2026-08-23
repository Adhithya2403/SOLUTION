class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] gg={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(String word:words)
        {
            String s="";
            for(char c:word.toCharArray())
            {
                s+=gg[c-'a'];
            }
            set.add(s);
        }
        return set.size();
    }
}