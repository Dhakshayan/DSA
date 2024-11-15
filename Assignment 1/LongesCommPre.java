public class LongesCommPre {
    public static String longestCommonPrefixBruteForce(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "-1";
        }
        
        String prefix = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            String currentString = arr[i];
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < Math.min(prefix.length(), currentString.length()); j++) {
                if (prefix.charAt(j) == currentString.charAt(j)) {
                    temp.append(prefix.charAt(j));
                } else {
                    break;
                }
            }
            prefix = temp.toString();
            if (prefix.isEmpty()) {
                return "-1";
            }
        }
        
        return prefix;
    }

    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        
        String result = longestCommonPrefixBruteForce(arr);
        System.out.println(result);
    }
}
