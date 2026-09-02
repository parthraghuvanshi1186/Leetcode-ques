class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int sum=0;int left=0;int count=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
        if(right-left+1==k){
           if(sum/k>=threshold){
            count++;
           }
            sum-=nums[left];
            left++;
        }
        }
     return count;
    }
}