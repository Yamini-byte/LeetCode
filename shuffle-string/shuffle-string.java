class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        String ans = "";
        char[] a = new char[n];
        for(int i = 0; i < n; i++){
            a[indices[i]] = s.charAt(i);
        }
        for(int i = 0; i < n; i++){
            ans += a[i];
        }
        return ans;
    }
}