class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); // create a new Stack
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch); // store opening brackets in the stack
            }
            else if (ch == ')' || ch == '}' || ch == ']'){
                if(st.isEmpty()){ // if string is empty return false
                    return false;
                }
                char top = st.peek(); // if not, compare with the top most element of it 
                 if(ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '['){
                    st.pop(); // pop the ch (char) from stack 
                 }
                 else{
                    return false;
                 }
            }
        }
        return st.isEmpty();
        
    }
}
