class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        StringBuilder st = new StringBuilder(s);
        while(i < j){
            if((isVowel(st.charAt(i)) == true) && (isVowel(st.charAt(j)) == true)){
                char ch = st.charAt(i);
                st.setCharAt(i,st.charAt(j));
                st.setCharAt(j,ch);
                i++;
                j--;
            }
            else{
                if(isVowel(st.charAt(i)) == false){
                    i++;
                }
                if(isVowel(st.charAt(j)) == false){
                    j--;
                }
            }
        }
        return st.toString();
    //     char[] ans = s.toCharArray();
    //     int j = s.length()-1;
    //     while(i < j){
    //         if((isVowel(ans[i]) == true) && (isVowel(ans[j]) == true)){
    //             char ch = ans[i];
    //             ans[i] = ans[j];
    //             ans[j] = ch;
    //         }
    //     }
    //     String answer = "";
    //     for(i=0;i<s.length();i++){
    //         answer += ans[i];
    //     }
    //     return answer;
    // }
    
    }
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}