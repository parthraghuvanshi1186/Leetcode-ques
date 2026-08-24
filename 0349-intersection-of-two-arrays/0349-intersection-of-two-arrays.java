class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int old=map.get(nums1[i]);
                map.put(nums1[i],old+1);
            }else{
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!list.contains(nums2[i])&&map.get(nums2[i])!=null){
                list.add(nums2[i]);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
      return ans;
        
}}