package Lab_5;

import java.util.Scanner;

public class Alphabet_pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= line; i++) {
            for (int space = 1; space <= line - i; space++) {
                System.out.print("  ");
            }
            char cha = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(cha + " ");
                cha++;
            }
            cha -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(cha + " ");
                cha--;
            }
            System.out.println();
        }
    }
}