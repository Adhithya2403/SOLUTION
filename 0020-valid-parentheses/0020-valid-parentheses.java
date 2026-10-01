class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char a: s.toCharArray()){
            if(a=='('||a=='{'||a=='['){
                st.push(a);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(a==')' && st.peek()=='('){
                    st.pop();
                }
                else if(a=='}' && st.peek()=='{'){
                    st.pop();
                }
                else if(a==']' && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}