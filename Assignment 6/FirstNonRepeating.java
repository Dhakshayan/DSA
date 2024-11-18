public class FirstNonRepeating {
    public static char firstNonRepeatingChar(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return s.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingChar(input);
        System.out.println(result == '\0' ? "none":result);
    }
}
