class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i:arr){
            if(i%2==0){
                if(a.contains(i/2))
                    return true;
            }
            if(a.contains(i*2))
                return true;
            a.add(i);
        }
        return false;
    }
}