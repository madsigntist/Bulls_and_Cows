import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(n - 2 > 0 ? calcDoubleFactorial(n - 2) : BigInteger.ONE);
    }
}