import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = 0;

        Random random = new Random(a + b);

        for (int i = 0; i < n; i++) {
            res += random.nextInt(b - a + 1) + a;
        }
        System.out.println(res);
    }
}