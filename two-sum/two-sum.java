class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> hs = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            //hs.put(nums[i],i);
            int targetElement = target - nums[i];
            if(hs.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = hs.get(target-nums[i]);
                break;
            }
            else{
                hs.put(nums[i],i);
            }
        }
        
        return result;
    }
}