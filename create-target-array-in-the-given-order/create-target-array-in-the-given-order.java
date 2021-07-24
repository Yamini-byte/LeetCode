class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int size = 0;
        for(int i = 0; i<nums.length;i++){
            int pos= index[i];
            if(pos < size){
                target = rightshift(target,pos);
                
            }
            target[pos] = nums[i];
            size++;
        }
        return target;
    }
    public int[] rightshift(int[] arr, int k){
        for(int i = arr.length-2; i>=k;i--){
            arr[i+1] = arr[i];
        }
        return arr;
    }
}