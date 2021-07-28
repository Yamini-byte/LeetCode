class Solution {
    public int trap(int[] height) {
        int lmax = 0;
        int n = height.length;
        int[] left = new int[n];
        int rmax = 0;
        int[] right = new int[n];
        for(int i = 0; i< n;i++){
            if(lmax < height[i]){
                lmax = height[i];
            }
            left[i] = lmax;
        }
        for(int i = n-1;i >= 0; i--){
            if(rmax < height[i]){
                rmax = height[i];
            }
            right[i] = rmax;
        }
        int[] ans = new int[n];
        for(int i = 0;i < n;i++){
            ans[i] = Math.min(left[i],right[i]) - height[i];
        }
        int total = 0;
        for(int i = 0;i < n;i++){
            total += ans[i];
        }
        return total;
    }
}