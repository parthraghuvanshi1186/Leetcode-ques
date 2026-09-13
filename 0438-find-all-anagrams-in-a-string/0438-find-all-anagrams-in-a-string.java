class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         int left=0;
        ArrayList<Integer> ans=new ArrayList<>();
       
        int k=p.length();
        int freq[]=new int[256];
        int freq2[]=new int[256];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)]++;
        }for(int right=0;right<s.length();right++){
            freq2[s.charAt(right)]++;
            if(right-left+1==k){
                if(Arrays.equals(freq,freq2)){
                    ans.add(left);
                }freq2[s.charAt(left)]--; 
                left++;
            }
        }return ans;
    }
}