import java.util.Scanner;

public class Alphabet_pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= lines; i++) {
            for (int space = 1; space <= lines - i; space++) {
                System.out.print("  ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}
