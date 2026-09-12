
class Solution {
    class Node {
        long score;
        int[] arr;

        Node(long score,int[] arr) {
            this.score = score;
            this.arr = arr;
        }
    }

    int[][] intervals;
    Node[][] dp;
    int n;

    public int[] maximumWeight(List<List<Integer>> intervals) {
        n = intervals.size();
        this.intervals = new int[n][4];

        for(int i=0;i<n;i++) {
            this.intervals[i][0] = intervals.get(i).get(0);
            this.intervals[i][1] = intervals.get(i).get(1);
            this.intervals[i][2] = intervals.get(i).get(2);
            this.intervals[i][3] = i;
        }

        Arrays.sort(this.intervals,(a,b)->a[0]-b[0]);

        dp = new Node[n][5];

        return solve(0,4).arr;
    }

    Node solve(int i,int k) {
        if(i == n || k == 0) {
            return new Node(0,new int[0]);
        }

        if(dp[i][k] != null) {
            return dp[i][k];
        }

        Node skip = solve(i+1,k);

        int next = findNext(i);
        Node temp = solve(next,k-1);

        int[] arr = new int[temp.arr.length+1];
        arr[0] = intervals[i][3];

        for(int j=0;j<temp.arr.length;j++) {
            arr[j+1] = temp.arr[j];
        }

        Arrays.sort(arr);

        Node take = new Node(temp.score+intervals[i][2],arr);

        if(better(take,skip)) {
            dp[i][k] = take;
        }
        else {
            dp[i][k] = skip;
        }

        return dp[i][k];
    }

    int findNext(int i) {
        int l = i+1;
        int r = n;

        while(l<r) {
            int mid = l+(r-l)/2;

            if(intervals[mid][0] > intervals[i][1]) {
                r = mid;
            }
            else {
                l = mid+1;
            }
        }

        return l;
    }

    boolean better(Node a,Node b) {
        if(a.score != b.score) {
            return a.score > b.score;
        }

        int len = Math.min(a.arr.length,b.arr.length);

        for(int i=0;i<len;i++) {
            if(a.arr[i] != b.arr[i]) {
                return a.arr[i] < b.arr[i];
            }
        }

        return a.arr.length < b.arr.length;
    }
}