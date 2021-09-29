import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();
            if ("0".equals(input)) {
                break;
            }
            try {
                System.out.println(Integer.parseInt(input) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + input);
            }
        }

    }
}