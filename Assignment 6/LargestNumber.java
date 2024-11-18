import java.util.*;
class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] array = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));
        if (array[0].equals("0")) {
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for (String num : array) {
            largest.append(num);
        }
        return largest.toString();
    }
    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        String result = ln.largestNumber(nums);
        System.out.println("Largest Number: " + result);
        sc.close();
    }
}
