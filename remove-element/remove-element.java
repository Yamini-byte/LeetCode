class Solution {
    public int removeElement(int[] nums, int val) {
        //int[] ans = new int[nums.length];
        int j = -1;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
        
    }
}