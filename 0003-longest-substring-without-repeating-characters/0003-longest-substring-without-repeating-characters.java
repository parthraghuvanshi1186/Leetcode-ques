class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
       int max=0;
        for(int right=0;right<s.length();right++){
           char ch=s.charAt(right);
            if(map.containsKey(ch)){
                int old=map.get(ch);
                map.put(ch,old+1);
            }else {
                map.put(ch,1);
            }while(map.get(ch)>1){
                char c=s.charAt(left);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }left++;
            }max=Math.max(max,right-left+1);
            }
            return max;
        }
}