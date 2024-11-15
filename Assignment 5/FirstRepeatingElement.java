import java.util.HashMap;
public class FirstRepeatingElement {
    public static int findFirstRepeating(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, m.get(arr[i]));
            } else {
                m.put(arr[i], i);
            }
        }

        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int result = findFirstRepeating(arr);
        System.out.println(result);
    }
}
