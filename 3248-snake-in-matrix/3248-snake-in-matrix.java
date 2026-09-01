class Solution {
    public int finalPositionOfSnake(int n, List<String> co) {
        int row=0;
        int col=0;
        for(String str:co)
        {
            if(str.equals("UP"))
            {
                row--;
            }else if(str.equals("DOWN"))
            {
                row++;
            }else if(str.equals("LEFT"))
            {
                col--;
            }else if(str.equals("RIGHT")){
                col++;
            }
        }
        return row*n+col;
    }
}