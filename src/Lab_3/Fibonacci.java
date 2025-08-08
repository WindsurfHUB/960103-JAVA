package Lab_3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fibonacci index: ");
        int index = input.nextInt();

        int a = 0, b = 1, fibo = 0;

        if (index == 0) {
            fibo = 0;
        } else if (index == 1) {
            fibo = 1;
        } else {
            int i = 2;
            while (i <= index) {
                fibo = a + b;
                a = b;
                b = fibo;
                i++;
            }
        }

        System.out.println("Lab_3.Fibonacci number at index " + index + " is " + fibo);
    }
}


