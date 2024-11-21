public class ValidPalin {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char first = s.charAt(start);
            char last = s.charAt(end);
            if (!Character.isLetterOrDigit(first)) {
                start++;
            } else if (!Character.isLetterOrDigit(last)) {
                end--;
            } else {
                if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalin solution = new ValidPalin();
        System.out.println(solution.isPalindrome("A man, a plan, a canal, Panama"));  // Should return true
        System.out.println(solution.isPalindrome("racecar")); 
        System.out.println(solution.isPalindrome("hello")); 
        System.out.println(solution.isPalindrome(""));
    }
}
