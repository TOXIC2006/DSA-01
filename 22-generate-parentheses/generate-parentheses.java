class Solution {
     int n;
      List<String> anwser;
       public void  helper( int o, int c, String str ){
          if( o==n && c==n){
             anwser.add(str);
             return;
          }
          if(o<n){
             helper( o+1,c,str+"(");
          }if(c<o){
            helper(o,c+1,str+")");
          }
          return;
       }
    public List<String> generateParenthesis(int n) {
       this.n=n;
       this.anwser= new ArrayList<>();
       helper(0,0,"");
       return anwser;

    }


     }
