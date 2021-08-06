class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map <String,Integer>mp = new HashMap<String,Integer>();
        Arrays.sort(strs);
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(mp.containsKey(s)){
                List li = res.get(mp.get(s));
                li.add(str);
            }else{
                List li = new ArrayList();
                li.add(str);
                res.add(li);
                mp.put(s,res.size()-1);
            }
        }
        return res;
    }
}