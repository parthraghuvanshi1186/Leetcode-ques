class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int old=map.get(nums[i]);
                map.put(nums[i],old+1);
            }else{
                map.put(nums[i],1);
            }
        }for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                list.add(nums[i]);
                map.put(nums[i],0);
            }
        }return list;
    }
}