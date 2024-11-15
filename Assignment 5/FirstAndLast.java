public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20, 50};
        int target = 20;
        int firstOccurrence = -1,lastOccurrence=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                firstOccurrence = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                lastOccurrence = i;
                break;
            }
        }

        System.out.println(firstOccurrence+" "+lastOccurrence);
    }
}
