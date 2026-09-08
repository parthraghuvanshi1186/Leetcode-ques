class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;int count=0;int max=0;int ans=0;
        int freq[]=new int[256];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)]++;
            max=Math.max(max,freq[s.charAt(right)]);
            while((right-left+1)-max>k){
                freq[s.charAt(left)]--;
                left++;
            }ans=Math.max(ans,right-left+1);
        }
            
           return ans;
    }
}