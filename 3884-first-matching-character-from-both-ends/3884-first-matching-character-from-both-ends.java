class Solution {
    public int firstMatchingIndex(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char ash=s.charAt(left);
            char win=s.charAt(right);
            if(ash==win){
                return left;
            }
            left++;
            right--;
        }
        return -1;
    }
}