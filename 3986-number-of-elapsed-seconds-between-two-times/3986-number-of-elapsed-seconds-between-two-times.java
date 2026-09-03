class Solution {
    public int convert(String time)
    {
        int hour=Integer.parseInt(time.substring(0,2));
        int min=Integer.parseInt(time.substring(3,5));
        int sec=Integer.parseInt(time.substring(6,8));

        return hour*3600+min*60+sec;
    }
    public int secondsBetweenTimes(String start, String end) {
        int st=convert(start);
        int en=convert(end);

        return en-st;
    }
}