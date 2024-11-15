class LongestPalindromicSubstring {
    public static String longestPalindrome(String str) {
        int n = str.length();
        if (n == 0) return "";
        String res = "";
        for (int i = 0; i < n; i++) {
            String odd = expandAroundCenter(str, i, i);
            String even = expandAroundCenter(str, i, i + 1);
            if (odd.length() > res.length()) res = odd;
            if (even.length() > res.length()) res = even;
        }
        return res;
    }

    private static String expandAroundCenter(String str, int l, int r) {
        while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
            l--;
            r++;
        }
        return str.substring(l + 1, r);
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println(longestPalindrome(str));
    }
}
