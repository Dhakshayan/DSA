import java.math.BigInteger;
class Factorial {
    static BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(factorial(num));
    }
}
