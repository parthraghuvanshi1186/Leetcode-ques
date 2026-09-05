class Solution {
    public int maxSatisfied(int[] c, int[] grumpy, int minutes) {
        int sum=0;int left=0;int max=0;int base=0;
        for(int right=0;right<c.length;right++){
            if(grumpy[right]==0){
                base+=c[right];
            }
            if(grumpy[right]==1){
            sum+=c[right];}
            if(right-left+1==minutes){
                max=Math.max(max,sum);
                if(grumpy[left]==1){
                sum-=c[left];}
                left++;
            }
        }

            return max+base;}
        }
    
