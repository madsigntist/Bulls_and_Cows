import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        var m = new BigInteger(scanner.next());
        var n = 0;

        var fact = BigInteger.ONE;
        while (fact.compareTo(m) < 0) {
            n++;
            fact = fact.multiply(BigInteger.valueOf(n));
        }

        System.out.println(n);
    }
}