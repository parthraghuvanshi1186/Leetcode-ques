class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > arr[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        int peak = l;

if (peak == 0 || peak == n - 1) {
    return false;
}

for (int i = 0; i < peak; i++) {
    if (arr[i] >= arr[i + 1]) return false;
}

for (int i = peak; i < n - 1; i++) {
    if (arr[i] <= arr[i + 1]) return false;
}

return true;
    }
}