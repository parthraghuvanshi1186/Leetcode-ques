class Solution {
    public int numJewelsInStones(String j, String s) {
        int[] freq=new int[256];
        int[] freq2=new int[256];
        for(int i=0;i<j.length();i++){
           freq[j.charAt(i)]++;
        }for(int i=0;i<s.length();i++){
            freq2[s.charAt(i)]++;
        }int count=0;
        for(int i=0;i<256;i++){
            if(freq[i]>0 && freq2[i]>0){
                count+=freq2[i];
            }
        }return count;
    }
}