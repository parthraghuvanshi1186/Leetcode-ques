class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum++;
            }else{
                sum--;
            }
        if(sum==0){
            max=i+1;
        }if(map.containsKey(sum)){
            int old=map.get(sum);
                int length=i-old;
                if(length>max){
                    max=length;
               } }else{
                    map.put(sum,i);
                }
             }
        return max;
    }
}