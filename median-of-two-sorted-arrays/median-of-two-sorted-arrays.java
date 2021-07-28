class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int[] arr = new int[n];
        int counter = 0 , i = 0 , j = 0;
        while(counter < n){
            if( i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    arr[counter] = nums1[i];
                    counter++;
                    i++;
                }
                else{
                    arr[counter] = nums2[j];
                    counter++;
                    j++;
                }
            }
            else if(j >= nums2.length){
                arr[counter] = nums1[i];
                counter++;
                i++;
            }
            else{
                arr[counter] = nums2[j];
                counter++;
                j++;
            }
            
        }
        if(n % 2 == 0){
            return (double)(arr[n/2] + arr[n/2 -1])/2;
        }
        else{
            return (double)arr[n/2];
        }
    }
}