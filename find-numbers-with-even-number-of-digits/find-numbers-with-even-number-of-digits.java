class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int numOfDigits = 0;
        for(int i:nums){
            numOfDigits = 0;
            while(i != 0){
                i /= 10;
                numOfDigits++;
                
            }
            if(numOfDigits%2 == 0){
                count++;
            }
        }
        return count;
    }
}