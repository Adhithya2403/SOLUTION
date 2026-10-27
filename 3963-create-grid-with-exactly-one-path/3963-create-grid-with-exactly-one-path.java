class Solution {
    public String[] createGrid(int m, int n) {
        String[] a=new String[m];
        for(int i=0;i<m;i++){
             StringBuilder s=new StringBuilder();
            for(int j=0;j<n;j++){
                if(i==0 || j==n-1){
                    s.append('.');
                }else{
                    s.append('#');
                }
            }
            a[i]=s.toString();
        }
        return a;
    }
}