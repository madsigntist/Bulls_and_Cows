import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String[] s = new Scanner(System.in).nextLine().split(" ");
        String p = "";

        for (int i = 0; i < Integer.parseInt(s[3]); i++) {
            if (i < Integer.parseInt(s[0])) {
                p += (char) ('A' + i % 20);
            } else if (i < Integer.parseInt(s[0]) + Integer.parseInt(s[1])) {
                p += (char) ('a' + i % 20);
            } else {
                p += i % 10;
            }
        }
        System.out.println(p);
    }
}