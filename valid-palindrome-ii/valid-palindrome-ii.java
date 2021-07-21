class Solution {
    public boolean validPalindrome(String s) {
        int i =0; int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return (isPalin(s.substring(i,j))||isPalin(s.substring(i+1,j+1)));
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean isPalin(String s){
        int i = 0;
        int j = s.length()-1;
        //char[] c = s.toCharArray();
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}