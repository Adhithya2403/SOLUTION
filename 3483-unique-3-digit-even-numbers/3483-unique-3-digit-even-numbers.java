class Solution {
    public int totalNumbers(int[] digit) {
        boolean[] used = new boolean[1000];
        int count=0;
        for(int i=0;i<digit.length;i++)
        {
            if(digit[i]==0)continue;
            for(int j=0;j<digit.length;j++)
            {
                if(j==i)continue;
                for(int k=0;k<digit.length;k++)
                {
                    if(k==i||k==j) continue;
                    if(digit[k]%2!=0) continue;
                    int num=digit[i]*100 + digit[j]*10 + digit[k];
                    if(!used[num]){
                        used[num]=true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}