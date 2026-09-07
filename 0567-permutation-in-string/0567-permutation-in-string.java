class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int k=s1.length();
        int[] freq1=new int[256];
        int[] freq2=new int[256];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)]++;
        }for(int right=0;right<s2.length();right++){
            freq2[s2.charAt(right)]++;
        if(right-left+1==k){
           if(Arrays.equals(freq1,freq2)){
            return true;
           }freq2[s2.charAt(left)]--;
           left++;}
        }return false;
    }
}