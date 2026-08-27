class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int old=map.get(nums[i]);
                map.put(nums[i],old+1);
            }else{
                map.put(nums[i],1);
            }
        }int[] ans=new int[k];
        for(int j=0;j<k;j++){
          int max=0;int element=0;
          for(int num:map.keySet()){
            if(map.get(num)>max){
                max=map.get(num);
                element=num;
            }
          }
            ans[j]=element;
            map.remove(element);}
        return ans;
    }
}