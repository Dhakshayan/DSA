import java.util.*;
public class KthSmallest {

    public int kthsmall(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int [] arr = {12, 3, 5, 7,19};
        KthSmallest kn = new KthSmallest();
        int val  = kn.kthsmall(arr, 2);
        System.out.println(val);
    }
}