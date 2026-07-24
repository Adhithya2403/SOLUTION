class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char f=sentence.charAt(i); 
            set.add(f);
        }
        return set.size() == 26;
    }
}