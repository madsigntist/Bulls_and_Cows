import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split("-");

        System.out.printf("%s/%s/%s", date[1], date[2], date[0]);
    }
}