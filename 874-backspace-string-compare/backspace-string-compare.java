class Solution {
    public boolean backspaceCompare(String s, String t) {
    return helper(s).equals(helper(t));


    }
    static Stack<Character> helper(String s){
        Stack<Character> st= new Stack<>();
       int s1=s.length();
        for( int i=0;i<s1;i++){
            char ch=s.charAt(i);
            if(ch!='#'){
                st.push(ch);
            }else{
                 if(!st.isEmpty()){
                    st.pop();
                 }
            }
        }
           return st;
       }
      
    }
