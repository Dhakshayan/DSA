import java.util.Arrays;
public class Chocolate{
  public static int diff(int a[], int n, int m){
    if(m == 0 || n == 0) return 0;
    Arrays.sort(a);
    int d = Integer.MAX_VALUE;
    for(int i = 0; i <= n - m; i++){
      int t = a[i + m - 1] - a[i];
      d = Math.min(d, t);
    }
    return d;
  }
  public static void main(String[] args){
    int a[] = {7, 3, 2, 4, 9, 12, 56};
    int m = 3;
    int n = a.length;
    System.out.println(diff(a, n, m));
  }
}
