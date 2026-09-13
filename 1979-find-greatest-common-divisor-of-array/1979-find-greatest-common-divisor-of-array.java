class Solution {
    public int findGCD(int[] nums) {int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int s=nums[i];
            max=Math.max(max,s);
            min=Math.min(min,s);
        }for(int i=min;i>1;i--){
            if(max%i==0 && min%i==0){
                return i;
            }
        }return 1;
    }
}