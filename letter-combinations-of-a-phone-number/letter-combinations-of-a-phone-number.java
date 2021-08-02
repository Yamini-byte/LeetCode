class Solution {
    public List<String> letterCombinations(String digits) {
        al = new ArrayList<>();
        if(digits.length() != 0){
            combo(digits,"");
        }
        
        return al;
    }
    public static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static ArrayList<String> al = new ArrayList<>();
	public static void combo(String ques, String ans) {
		if(ques.length() == 0) {
			al.add(ans);
		}
		else {
			char ch = ques.charAt(0);
			String st = map[ch - '0'];
			for(int i = 0; i<st.length();i++) {
				combo(ques.substring(1),ans+st.charAt(i));
			}
		}
	}
}