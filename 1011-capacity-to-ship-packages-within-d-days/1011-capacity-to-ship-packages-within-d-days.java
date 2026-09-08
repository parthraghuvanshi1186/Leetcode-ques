class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for(int i = 0; i < weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }

        int ans = right;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            int day = 1;
            int sum = 0;

            for(int i = 0; i < weights.length; i++) {

                if(sum + weights[i] <= mid) {
                    sum += weights[i];
                }
                else {
                    day++;
                    sum = weights[i];
                }
            }

            if(day <= days) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return ans;
    }
}