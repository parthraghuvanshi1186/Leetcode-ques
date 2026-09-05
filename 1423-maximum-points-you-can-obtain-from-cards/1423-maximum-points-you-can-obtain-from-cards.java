class Solution {
    public int maxScore(int[] nums, int k) {
       int n=nums.length;
       int total=0;
       for(int i=0;i<nums.length;i++){
          total+=nums[i];
       }int w=n-k;
       if(w==0){
        return total;
       }
        int left=0;int sum=0;int min=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if(right-left+1==w){
                min=Math.min(min,sum);
                sum-=nums[left];
                left++;
            }
        }return total-min;
    }
}