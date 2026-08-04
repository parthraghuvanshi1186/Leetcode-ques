class Solution {
    public boolean judgeSquareSum(int c) {
        int l=0;int r=(int)Math.sqrt(c);
        while(l<=r){
            long s=(long)(Math.pow(l,2)+Math.pow(r,2));
            if(c==s){
                return true;
            }else if(s<c){
                l++;
            }else{
                r--;
            }
            }return false;
        }
    }
