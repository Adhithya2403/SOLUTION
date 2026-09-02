class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){
                int rem=st.pop();
                int rem2=st.peek();
                st.push(rem);
                st.push(rem+rem2);
            }else if(op[i].equals("C"))
            {
                st.pop();
            }
            else if(op[i].equals("D"))
            {
                st.push(st.peek()*2);
            }else{
                st.push(Integer.parseInt(op[i]));
            }
        } 
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}