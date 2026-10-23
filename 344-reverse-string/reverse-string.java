class Solution {
    public void reverseString(char[] s) {
        Stack<Character>  st= new Stack<>();
         int n=s.length;
         for( int i=0;i<n;i++){
            st.push(s[i]);
         } 
         for( int i=0;i<n;i++){
            s[i]=st.pop();
         }
    }
}