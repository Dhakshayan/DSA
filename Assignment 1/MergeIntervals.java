import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] arr) {
        if (arr.length== 0) return new int[0][0];
        Arrays.sort(arr,(a, b)->a[0]-b[0]);
        List<int[]>res=new ArrayList<>();
        int[] curr= arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i][0]<=curr[1]) {
                curr[1] =Math.max(curr[1],arr[i][1]);
            } else {
                res.add(curr);
                curr=arr[i];
            }
        }
        res.add(curr);
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr= { {1, 3},{2, 4},{6, 8},{9, 10} };
        int[][] res= merge(arr);
        for (int[] r:res) {
            System.out.println(Arrays.toString(r));
        }
    }
}
