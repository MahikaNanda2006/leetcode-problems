package Medium.Array;
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        int start = 0, end = 0;           // indices of best window

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);       // odd centre
            int len2 = expand(s, i, i + 1);   // even centre
            int len  = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end   = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // returns length of palindrome centred at [left, right]
    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length()
               && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;      // length after last valid step
    }
}
