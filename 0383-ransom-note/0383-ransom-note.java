class Solution {
    public boolean canConstruct(String r, String m) {
        int freq[]=new int[256];
        int freq2[]=new int[256];
       for(int i=0;i<r.length();i++){
        freq[r.charAt(i)]++;}
        for(int i=0;i<m.length();i++){
        freq2[m.charAt(i)]++;
       }for(int i=0;i<256;i++){
        if(freq[i]>freq2[i]) {
            return false;}
       }return true;
    }
}