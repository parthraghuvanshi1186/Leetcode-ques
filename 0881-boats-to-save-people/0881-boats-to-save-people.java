class Solution {
    public int numRescueBoats(int[] arr, int limit) {Arrays.sort(arr);
        int l=0;int r=arr.length-1;int boat=0;
        while(l<=r){
            int sum=arr[l]+arr[r];
            if(sum<=limit){
                l++;
            }r--;boat++;
        }return boat;
    }
}