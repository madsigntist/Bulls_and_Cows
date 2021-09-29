import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int u1 = scanner.nextInt();
        int u2 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        double cos = Math.toDegrees(Math.acos((u1 * v1 + u2 * v2) / (Math.hypot(u1, u2) * Math.hypot(v1, v2))));

        System.out.println(cos);
    }
}