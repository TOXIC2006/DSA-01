class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
       int n=  s.length();
        if( n==1){
             return 1;
        }
          for( int i=0;i<n;i++){
                char ch= s.charAt(i);
                map.put(ch, map.getOrDefault(ch,0)+1);
          }
          int count =0;
          for( var e:map.entrySet()){
             if( e.getValue()%2>=0 ){
                   count += e.getValue() - (e.getValue() % 2);
             }
          }
           if( count<n){
             return count+1;
           }
           return count;
    }
}