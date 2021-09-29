import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int d = scanner.nextInt();
        int h = scanner.nextInt();

        double t = d / h;

        System.out.println(t);
    }
}