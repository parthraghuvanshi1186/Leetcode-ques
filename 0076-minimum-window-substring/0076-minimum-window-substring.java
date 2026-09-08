class Solution {
    public String minWindow(String s, String t) {

        int l = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;

        int freq1[] = new int[256];
        int freq2[] = new int[256];

        for (char ch : t.toCharArray()) {
            freq1[ch]++;
        }

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);
            freq2[ch]++;

            if (freq2[ch] <= freq1[ch]) {
                count++;
            }

            while (count == t.length()) {

                if (r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }

                char leftChar = s.charAt(l);

                freq2[leftChar]--;

                if (freq2[leftChar] < freq1[leftChar]) {
                    count--;
                }

                l++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + min);
    }
}