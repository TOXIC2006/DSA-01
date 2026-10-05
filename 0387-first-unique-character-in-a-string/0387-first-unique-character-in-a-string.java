class Solution {
    public int firstUniqChar(String s) {
         Map<Character,Integer> map = new HashMap<>();
          int n=  s.length();
          for( int i=0;i<n;i++){
                char ch= s.charAt(i);
                map.put(ch, map.getOrDefault(ch,0)+1);
          }
          for( int i=0;i<n;i++){
             char ch1= s.charAt(i);
             if( map.get(ch1)==1){
                 return i;
             }
          }

           return -1;
    }
}