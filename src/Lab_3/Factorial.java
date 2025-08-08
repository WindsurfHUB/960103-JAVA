package Lab_3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n = input.nextInt();

        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println(n + "! = " + fact);
    }
}

