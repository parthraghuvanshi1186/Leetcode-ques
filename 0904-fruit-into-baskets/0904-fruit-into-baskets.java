class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;int max=0;
        for(int right=0;right<f.length;right++){
        if(map.containsKey(f[right])){
            int old=map.get(f[right]);
            map.put(f[right],old+1);
        }else{
            map.put(f[right],1);
        }while(map.size()>2){
            int old=map.get(f[left]);
            map.put(f[left],old-1);
        if(map.get(f[left])==0){
            map.remove(f[left]);
        }left++;
    }max=Math.max(max,right-left+1);
}return max;
}}