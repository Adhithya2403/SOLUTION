class Solution {
    public int canBeTypedWords(String tx, String bl) {
        String word[] = tx.split(" ");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            boolean type=true;
            for (int j = 0; j < bl.length(); j++) {
                if (word[i].contains(String.valueOf(bl.charAt(j)))) {
                    type=false;
                    break;
                }
            }
            if(type){
                count++;
            }
        }
        return count;
    }
}