class Solution {
    public int[][] flipAndInvertImage(int[][] im) {
        int m=im.length;
        int arr[][]=new int[m][im[0].length];
        for(int i=0;i<im.length;i++)
        {
            int k=0;
            for(int j=im[0].length-1;j>=0;j--)
            {
                if(im[i][j]==0)
                {
                    arr[i][k++]=1;
                }else
                {
                    arr[i][k++]=0;
                }
            }
        }
        return arr;
    }
}