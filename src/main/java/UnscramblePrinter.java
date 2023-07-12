import java.util.Scanner;

public class UnscramblePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String unscrambledLine = unscramble(line);
            System.out.println(unscrambledLine);
        }
    }

    public static String unscramble(String line) {
        int length = line.length();
        StringBuilder sb = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            sb.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            sb.append(line.charAt(i));
        }

        return sb.toString();
    }
}
