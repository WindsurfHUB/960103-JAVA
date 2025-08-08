package Lab_5;

import java.util.Scanner;

public class Multi_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table : ");
        int inp = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(inp + " * " + i + " = " + (inp * i));
        }

    }
}
