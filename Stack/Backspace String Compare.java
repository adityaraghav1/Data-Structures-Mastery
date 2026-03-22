class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>(); // stack for string s
        Stack<Character> st2 = new Stack<>(); // stack for string t
        for(int i = 0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            if(ch1!= '#'){
                st1.push(ch1);
            }
            else if(ch1 == '#' && !st1.isEmpty()){
                st1.pop();
            }           
        }
        for(int j = 0; j<t.length(); j++){
            char ch2 = t.charAt(j);
            if(ch2!= '#'){
                st2.push(ch2);
            }
            else if(ch2 == '#' && !st2.isEmpty()){
                st2.pop();
            }           
        }
        return st1.equals(st2); //compare &return
        
    }
}
