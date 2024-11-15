public class WaveArray {
    public static void toWave(int[] a) {
        for (int i = 0; i < a.length - 1; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 5, 10, 7, 20};
        toWave(a);
        for (int x : a) {
            System.out.print(x + ",");
        }
    }
}
