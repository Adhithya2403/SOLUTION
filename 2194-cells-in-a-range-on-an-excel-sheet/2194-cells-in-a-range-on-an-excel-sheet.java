class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list= new ArrayList<>();
        char startcol=s.charAt(0);
        char startrow=s.charAt(1);
        char endcol=s.charAt(3);
        char endrow=s.charAt(4);
        for(char col = startcol;col<=endcol;col++){
            for(char row =startrow;row<=endrow;row++){
                list.add(""+col + row);
            }
        }
        return list;
    }
}