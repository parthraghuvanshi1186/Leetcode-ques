class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int total=0,min=nums[0],max=nums[0],sum1=0,sum2=0;
       for(int i=0;i<nums.length;i++){
        total+=nums[i];
        sum1=Math.max(nums[i],sum1+nums[i]);
        max=Math.max(max,sum1);

        sum2=Math.min(nums[i],sum2+nums[i]);
        min=Math.min(min,sum2);
       }
        if(max<0){
            return max;
        
       } return Math.max(max,total-min);
    }
}