class Solution {
    public int numJewelsInStones(String j, String s) {
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++){
           freq[s.charAt(i)]++;
        }int count=0;
        for(int i=0;i<j.length();i++){
            if(freq[j.charAt(i)]>0){
                count+=freq[j.charAt(i)];
            }
        }return count;
    }
}