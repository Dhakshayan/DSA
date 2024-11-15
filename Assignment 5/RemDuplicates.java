import java.util.*;

public class RemDuplicates {
    public Integer[] removedupes(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i])) {
                hs.add(arr[i]);
            }
        }
        Integer[] arra = hs.toArray(new Integer[0]);
        return arra;
    }

    public static void main(String[] args) {
        RemDuplicates rem = new RemDuplicates();
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};
        Integer[] result = rem.removedupes(arr);
        for (Integer num : result) {
            System.out.print(num + ",");
        }
    }
}
