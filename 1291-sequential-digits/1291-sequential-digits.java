class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        
        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();
        
        for (int len = lowLen; len <= highLen; len++) {
            int firstNum = 0;
            int stepVal = 0;
            
            for (int j = 1; j <= len; j++) {
                firstNum += j * Math.pow(10, len - j);
                stepVal += 1 * Math.pow(10, len - j);
            }
            
            int current = firstNum;
            int maxStarts = 10 - len;
            
            for (int count = 0; count < maxStarts; count++) {
                if (current >= low && current <= high) {
                    result.add(current);
                }
                current += stepVal;
            }
        }
        
        return result;
    }
}