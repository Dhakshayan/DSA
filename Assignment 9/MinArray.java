import java.util.Arrays;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
    }
    
}
