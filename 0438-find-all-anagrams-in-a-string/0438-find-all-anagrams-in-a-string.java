class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        int left=0;int k=p.length();
        int[] freq1=new int[256];
        int[] freq2=new int[256];
        
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)]++;
        }for(int right=0;right<s.length();right++){
                freq2[s.charAt(right)]++;
            if(right-left+1==k){
                if(Arrays.equals(freq1,freq2)){
                    ans.add(left);
                }
                freq2[s.charAt(left)]--;
                left++;}
            }return ans;
        }
    }
