class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String word:details){
            String age=word.substring(11,13);
            int aggee=Integer.parseInt(age);
            if(aggee>60){
                count++;
            }
        }
        return count;
    }
}