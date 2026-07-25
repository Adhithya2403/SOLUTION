class Solution {
    public int maxProduct(int n) {
        int t=n;int count=0;
        while(t>0){
            t=t/10;
            count++;
        }
        int arr[] = new int[count];
        t=n;int i=0;
        while(t>0){
            arr[i++]=t%10;
            t=t/10;
        }
        Arrays.sort(arr);
        return (arr[arr.length-1])*(arr[arr.length-2]);
    }
}