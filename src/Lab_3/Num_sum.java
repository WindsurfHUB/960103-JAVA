package Lab_3;

import java.util.Scanner;

public class Num_sum {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = input.nextInt();

        int sum = 0;
        int i = 0;

        while (i < n) {
            System.out.print("Enter number" + (i + 1) + " : ");
            sum += input.nextInt();
            i++;
        }

        System.out.println("Total is: " + sum);
        System.out.println("Average is: " + sum / n);
        System.out.println("Sum is " + ((sum % 2 == 0) ? "EVEN" : "ODD"));
    }
}
