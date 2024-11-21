public class IsSubSeq {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char c : t.toCharArray()) {
            if (i < s.length() && s.charAt(i) == c) {
                i++;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        IsSubSeq sol = new IsSubSeq();
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(sol.isSubsequence(s, t));
    }
}
