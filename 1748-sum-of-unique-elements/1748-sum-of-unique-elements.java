class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int old=map.get(nums[i]);
            map.put(nums[i],old+1);
        }else{
            map.put(nums[i],1);
        }
       } for(int i=0;i<nums.length;i++){
        if(map.get(nums[i])==1){
            sum+=nums[i];
        }
       }return sum;
    }
}