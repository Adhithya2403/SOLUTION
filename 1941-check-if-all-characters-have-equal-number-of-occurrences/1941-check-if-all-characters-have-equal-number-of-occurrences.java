class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int val=map.get(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(map.get(s.charAt(i))!=val){
                return false;
            }      
        }
        return true;
    }
}