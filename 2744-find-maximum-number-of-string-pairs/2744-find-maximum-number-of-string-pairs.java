class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count=0;
        for(String word:words){
            String rev = new StringBuilder(word).reverse().toString();
            if(set.contains(rev)){
                count++;
            }
            set.add(word);
        }
        return count;
    }
}