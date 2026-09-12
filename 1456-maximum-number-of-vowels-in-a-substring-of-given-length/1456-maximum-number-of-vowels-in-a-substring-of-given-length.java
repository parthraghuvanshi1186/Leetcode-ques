class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int max=0;int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sum++;
            
            }if(i-left+1==k){
                max=Math.max(max,sum);
                char r=s.charAt(left);
                if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'){
                    sum--;
                } 
                left++;
            }
        }return max;
    }
}