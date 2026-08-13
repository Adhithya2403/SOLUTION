class Solution {
    public int prefixCount(String[] words, String pref) {
        int Actual=0;
        for(String ab : words){
            
            if(ab.length()<pref.length()){
                continue;
            }
            int count=0;
            for(int i=0;i<pref.length();i++){
                char ch=ab.charAt(i);
                char cc=pref.charAt(i);
                if(cc==ch){
                    count++;
                }
            }
            if(count==pref.length()){
                Actual++;
            }
        }
        return Actual;
    }
}