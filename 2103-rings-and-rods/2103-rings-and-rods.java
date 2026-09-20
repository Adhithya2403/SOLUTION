class Solution {
    public int countPoints(String rings) {
        HashMap<Integer,HashSet<Character>> map = new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            char colour=rings.charAt(i);
            int rod=rings.charAt(i+1)-'0';
            map.putIfAbsent(rod,new HashSet<>());
            map.get(rod).add(colour);
        }

        int count=0;
        for(HashSet<Character> set:map.values()){
            if(set.size()==3){
                count++;
            }
        }
        return count;
    } 
}