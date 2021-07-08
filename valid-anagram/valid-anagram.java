class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hs1 = new HashMap<>();
        HashMap<Character, Integer> hs2 = new HashMap<>();
        for(char a: s.toCharArray()){
            if(hs1.containsKey(a)==true){
                hs1.put(a,hs1.get(a)+1);
            }
            else{
                hs1.put(a,1);
            }
        }
        // for(char a: s.toCharArray()){
        //     if(hs2.containsKey(a)==true){
        //         hs2.put(a,hs1.get(a)+1);
        //     }
        //     else{
        //         hs2.put(a,1);
        //     }
        // }
        for(char a: t.toCharArray()){
            if(hs1.containsKey(a)==false){
                return false;
            }
            else if(hs1.containsKey(a)== true){
                hs1.put(a,hs1.get(a)-1);
                    //return false;
            }
            //continue;
        }
        for(Map.Entry<Character,Integer> i : hs1.entrySet()){
            if(i.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}