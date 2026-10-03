class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> st = new Stack<>();
          int n= s.length();
           if(n==0){
             return "";
           }
           int i=n-2;
           st.push(s.charAt(n-1));
           while(i>=0){
             char ch= s.charAt(i);
              if(!st.isEmpty() && ch==st.peek() ){
                st.pop();
              }else{
                 st.add(ch);
              }
              i--;

           }
           String str= new String();
            int size= st.size();
           if(size>0){
           for( int j=0;j<size;j++){
               str=str+st.pop();
           }
           }

           

            return str;

    }
}