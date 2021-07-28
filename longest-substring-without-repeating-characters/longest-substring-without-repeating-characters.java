class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0, j=0;
        int[] arr = new int[256];
        for(int i = 0; i < s.length();i++){
            j = (arr[s.charAt(i)] > 0) ? Math.max(j , arr[s.charAt(i)]):j;
            
            arr[s.charAt(i)] = i + 1;
            
            result = Math.max(result , i-j+1);
        }
        return result;
    }
}