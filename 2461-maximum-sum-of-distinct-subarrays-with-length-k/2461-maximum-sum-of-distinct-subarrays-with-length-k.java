class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0; 
        long sum=0;
        long max=0;
        for(int right=0;right<nums.length;right++){
            if(map.containsKey(nums[right])){
                int old=map.get(nums[right]);
                map.put(nums[right],old+1);
            }else{
                map.put(nums[right],1);
            }  sum+=nums[right];

              if(right-left+1==k){
                if(map.size()==k){
                    max=Math.max(max,sum);
                }sum-=nums[left];
                int old=map.get(nums[left]);
               if(old==1){
               map.remove(nums[left]);
               }else{
                map.put(nums[left],old-1);
               }
               left++;

              }
           
        }return max;
    }
}