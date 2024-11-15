class Solution {
    public String longestCommonPrefix(String[] arr) {
        String pre = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) return "-1";
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(sol.longestCommonPrefix(arr));
    }
}
