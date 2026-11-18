class Solution {
    private static final  Map<Character, String> KEYPAD=new HashMap<>();
     static{
        KEYPAD.put('2', "abc");
        KEYPAD.put('3', "def");
        KEYPAD.put('4', "ghi");
        KEYPAD.put('5', "jkl");
        KEYPAD.put('6', "mno");
        KEYPAD.put('7', "pqrs");
        KEYPAD.put('8', "tuv");
        KEYPAD.put('9', "wxyz");
     }
    public List<String> letterCombinations(String di) {
     
     List<String>docs= new ArrayList<>();
     if(di==null || di.isEmpty()){
         return docs;
     }
    StringBuilder ele= new StringBuilder();
     helper(di,docs,ele,0);
     return  docs;
     
    }
    static  void helper(String list,List<String> ans,StringBuilder ele,int idx){
     
         if(idx==list.length()){
             ans.add(ele.toString());
             return;
         }
    
         String let=KEYPAD.get(list.charAt(idx));
         for( int i=0;i<let.length();i++){
             char c=let.charAt(i);
             ele.append(c);
             helper(list,ans,ele,idx+1);
             ele.deleteCharAt(idx);
              
         }
    }
     

    
}